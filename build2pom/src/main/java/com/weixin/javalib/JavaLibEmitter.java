package com.weixin.javalib;

import static com.weixin.utils.Utils.stripSingleQuotes;

import com.weixin.datastore.DependenciesMap;
import com.weixin.datastore.GlobalParas;
import com.weixin.jarslib.ThirdPartyDependencyGenerator;
import com.weixin.javalib.gen.PANTSBaseListener;
import com.weixin.javalib.gen.PANTSParser;
import com.weixin.javalib.gen.PANTSParser.Dependent_entryContext;
import com.weixin.javalib.gen.PANTSParser.Lib_itemContext;
import com.weixin.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;

public class JavaLibEmitter extends PANTSBaseListener {

  ParseTreeProperty<String> xml = new ParseTreeProperty<String>();

  String getXML(ParseTree ctx) {
    return xml.get(ctx);
  }

  void setXML(ParseTree ctx, String s) {
    xml.put(ctx, s);
  }

  @Override public void exitLib_item_list(PANTSParser.Lib_item_listContext ctx) {
    String name = "";
    String deps = "";
    for(Lib_itemContext lctx : ctx.lib_item()){
      if(lctx.start.getType() == PANTSParser.NAME){
        name = getXML(lctx);
      }
      else if(lctx.start.getType() == PANTSParser.DEPENDENCIES){
        deps = getXML(lctx);
      }
    }
    DependenciesMap.INSTANCE.setDependency(name,deps);
  }


  @Override public void exitLib_item(PANTSParser.Lib_itemContext ctx) {
    if(ctx.start.getType() == PANTSParser.NAME){
      setXML(ctx,getXML(ctx.name_item()));
    }
    else if(ctx.start.getType() == PANTSParser.DEPENDENCIES){
     setXML(ctx,getXML(ctx.dependencies_item()));
    }


  }
  @Override public void exitName_item(PANTSParser.Name_itemContext ctx) {
    String name = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    // for each BUILD file, there would only be one java_library, or scala_library
    // but there would be jvm_library also, so we need to handle specially
    // this is a purly hack. name_item ->lib_item -> lib_item_list -> jvm_lib_stmt , so we need walk up 3 times
    if(! (ctx.getParent().getParent().getParent().start.getType() == PANTSParser.JVM_LIBRARY)){
      GlobalParas.INSTANCE.setJavaLibName(name);
    }
    setXML(ctx,name);
  }
  @Override public void exitDependencies_item(PANTSParser.Dependencies_itemContext ctx) {
    ST st = GlobalParas.INSTANCE.getStg().getInstanceOf("itemsTemplate");
    st.add("tag", "dependencies");
    st.add("fields",getXML(ctx.dependent_list()));
    setXML(ctx, st.render());
//    System.out.println(st.render());

  }

  @Override
  public void exitDependent_list(PANTSParser.Dependent_listContext ctx) {
    List<String> l = new ArrayList<>();
    for (Dependent_entryContext dctx : ctx.dependent_entry()) {
      String text = getXML(dctx);
      l.add(text);
    }
    ST st = GlobalParas.INSTANCE.getStg().getInstanceOf("object");
    st.add("fields", l);
    setXML(ctx, st.render());
//    System.out.println(st.render());
  }

  @Override
  public void exitDependent_entry(PANTSParser.Dependent_entryContext ctx) {
    String entry = stripSingleQuotes(ctx.SINGLE_QUOTED_STRING().getText());
    String[] items = entry.split(":");
    if (items[0].startsWith("3rdparty")) {
      ThirdPartyDependencyGenerator generator = new ThirdPartyDependencyGenerator();
      String name = items.length > 1 ? items[1]
          : items[0].substring(items[0].lastIndexOf("/") + 1);
      String text = generator.getDependency(items[0], name);
      if (text != null) {
        setXML(ctx, text);
      }
    } else {
      String groupId = Utils.getGroupId(entry);
      String aId = Utils.getArtifcatId(entry);
      ST st = GlobalParas.INSTANCE.getStg().getInstanceOf("coordinatesTemplate");
      st.add("groupId", groupId);
      st.add("artifactId", aId);
      st.add("tag", "dependency");
      setXML(ctx, st.render());
    }
  }
}

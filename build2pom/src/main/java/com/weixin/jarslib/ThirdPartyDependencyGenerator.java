package com.weixin.jarslib;

import static com.weixin.utils.Utils.basePath;

import com.weixin.datastore.DependenciesMap;
import com.weixin.jarslib.gen.JarsLibLexer;
import com.weixin.jarslib.gen.JarsLibParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ThirdPartyDependencyGenerator {

  public void process(InputStream is) throws IOException {
    JarsLibLexer lex = new JarsLibLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    JarsLibParser parser = new JarsLibParser(tokens);
    ParseTree tree = parser.jarslib();

    ParseTreeWalker walker = new ParseTreeWalker();
    JarDependentEmitter emitter = new JarDependentEmitter();
    walker.walk(emitter, tree);

  }

  public String getDependency(String inputFile, String name) {
    String fullPath = basePath + "/" + inputFile + "/BUILD";
    String dependent = DependenciesMap.INSTANCE.getDependency(name);
    // deduplicate, there might be duplicate dependency, for ex
    //  '3rdparty/jvm/org/apache/httpcomponents:httpasyncclient',
    //  '3rdparty/jvm/org/apache/httpcomponents:httpclient',
    // httpasyncclient and httpclient has common dependencies, which would make duplicate entry here
    // in backend/src/java/com/tinder/backend/shared/common/BUILD
    if (dependent != null) {
      return DependenciesMap.INSTANCE.getDependency(name);
    }
    try {
      InputStream is = new FileInputStream(fullPath);
      process(is);
      dependent = DependenciesMap.INSTANCE.getDependency(name);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return dependent;

  }


  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }
    ThirdPartyDependencyGenerator generator = new ThirdPartyDependencyGenerator();
    generator.process(is);

  }

}

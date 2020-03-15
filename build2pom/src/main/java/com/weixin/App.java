package com.weixin;


import com.weixin.datastore.DependenciesMap;
import com.weixin.datastore.GlobalParas;
import com.weixin.javalib.PomGenerator;
import com.weixin.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.stringtemplate.v4.ST;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) throws IOException{
    if(args.length == 0 || args[0] == null || args[0].trim().length() == 0){
      System.err.println("please specify parent folder path of pant's 3rdparty jvm library path");
      System.out.println("for ex, if your 3rdparty libary is /aa/bb/3rdparty, you can pass in /aa/bb");
      System.out.println("Usage: java -jar /xxx/xx");
      System.exit(1);
    }
    String currentDirectory = System.getProperty("user.dir");
    File file = new File(currentDirectory + "/BUILD");
    if (!file.exists()) {
      System.err.println("no BUILD file found");
      System.exit(1);
    }

    InputStream is = new FileInputStream(currentDirectory + "/BUILD");

    GlobalParas.INSTANCE.setBasePath(args[0]);

    App app = new App();
    URL url = app.getClass().getClassLoader().getResource("pom.stg");
    GlobalParas.INSTANCE.setStg(url);

    PomGenerator generator = new PomGenerator();
    generator.process(is);
    String deps = DependenciesMap.INSTANCE.getDependency(GlobalParas.INSTANCE.getJavaLibName());

    String groupId = Utils.getGroupId(currentDirectory);
    ST st = GlobalParas.INSTANCE.getStg().getInstanceOf("pomTemplate");
    st.add("arId", GlobalParas.INSTANCE.getJavaLibName());
    st.add("groupId", groupId);
    st.add("depends", deps);
    String xml = Utils.xmlDeduplicate(st.render());
    System.out.println(xml);
    Utils.writePomFile(xml, currentDirectory);
  }

}

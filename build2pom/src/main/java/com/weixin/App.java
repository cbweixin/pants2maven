package com.weixin;


import com.weixin.datastore.DependenciesMap;
import com.weixin.datastore.GlobalParas;
import com.weixin.javalib.PomGenerator;
import com.weixin.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.stringtemplate.v4.ST;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) throws IOException, URISyntaxException {
    String currentDirectory = System.getProperty("user.dir");
    File file = new File(currentDirectory + "/BUILD");
    if (!file.exists()) {
      System.err.println("no BUILD file found");
      System.exit(1);
    }

    InputStream is = new FileInputStream(currentDirectory + "/BUILD");

    String basePath = Utils.getBasePath(currentDirectory);
    if (basePath == null || basePath.trim().length() == 0) {
      System.err.println("not in palo repo");
      System.exit(1);
    }
    GlobalParas.INSTANCE.setBasePath(basePath);

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
    System.out.println(st.render());
    Utils.writePomFile(st.render(), currentDirectory);
  }

}

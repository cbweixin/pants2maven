package com.weixin;


import com.weixin.datastore.DependenciesMap;
import com.weixin.datastore.GlobalParas;
import com.weixin.javalib.PomGenerator;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.stringtemplate.v4.ST;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        App app = new App();
        String templatePath = app.getClass().getClassLoader().getResource("pom.stg").getPath();
        System.out.println(templatePath);
        GlobalParas.INSTANCE.setStg(templatePath);

        PomGenerator generator = new PomGenerator();
        generator.process(is);
//    System.out.println(libName);
        String deps = DependenciesMap.INSTANCE.getDependency(GlobalParas.INSTANCE.getJavaLibName());
//    System.out.println(deps);
        String currentDirectory = System.getProperty("user.dir");

    System.out.println("The current working directory is " + currentDirectory);
        String groupId = Arrays.stream(currentDirectory.split("/")).collect(Collectors.joining("."));
        ST st = GlobalParas.INSTANCE.getStg().getInstanceOf("pomTemplate");
        st.add("arId", GlobalParas.INSTANCE.getJavaLibName());
        st.add("groupId",groupId);
        st.add("depends",deps);
        System.out.println(st.render());
    }

}

package com.weixin.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class Utils {

  public static String stripSingleQuotes(String s) {
    if (s == null || s.charAt(0) != '\'') {
      return s;
    }
    return s.substring(1, s.length() - 1);
  }

  public static String getBasePath(String curPath){

    String[] paths = curPath.split("/");
    int idx = IntStream.range(0, paths.length).filter(i -> "palo".equals(paths[i])).findFirst().orElse(-1);
    if(idx == -1){
      return null;
    }

    String[] basePaths = Arrays.copyOfRange(paths, 0, idx+1);
    return Arrays.stream(basePaths).collect(Collectors.joining("/"));
  }

  public static void writePomFile(String contents, String filePath) throws IOException {
    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + "/pom.xml"));
    writer.write(contents);
    writer.close();
  }

}

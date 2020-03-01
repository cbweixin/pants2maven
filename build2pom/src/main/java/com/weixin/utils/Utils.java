package com.weixin.utils;

import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class Utils {
  public static String basePath = "/Users/xinwei/Documents/tinder/github/palo";

  public static String stripSingleQuotes(String s) {
    if (s == null || s.charAt(0) != '\'') {
      return s;
    }
    return s.substring(1, s.length() - 1);
  }

}

package com.weixin.datastore;

import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public enum GlobalParas {
  INSTANCE;

  private String javaLibName;
  private String basePath;
  private STGroup stg;

  public String getJavaLibName(){
    return javaLibName;
  }

  public void setJavaLibName(String value){
    javaLibName = value;
  }

  public void setBasePath(String path){
    basePath = path;
  }

  public String getBasePath(){
    return basePath;
  }

  public STGroup getStg(){
    return stg;
  }

  public void setStg(String path){
    stg = new STGroupFile(path);
  }
}

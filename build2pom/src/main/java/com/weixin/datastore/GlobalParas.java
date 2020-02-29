package com.weixin.datastore;

public enum GlobalParas {
  INSTANCE;

  private String javaLibName;

  public String getJavaLibName(){
    return javaLibName;
  }

  public void setJavaLibName(String value){
    javaLibName = value;
  }
}

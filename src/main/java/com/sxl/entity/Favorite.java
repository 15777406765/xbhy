package com.sxl.entity;


import java.io.Serializable;

public class Favorite implements Serializable {

  private Integer uId;
  private Integer aId;

  public Integer getuId() {
    return uId;
  }

  public void setuId(Integer uId) {
    this.uId = uId;
  }

  public Integer getaId() {
    return aId;
  }

  public void setaId(Integer aId) {
    this.aId = aId;
  }
}

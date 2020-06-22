package com.sxl.entity;


import java.io.Serializable;

public class MeetingJoin implements Serializable {

  private Integer uId;
  private Integer cId;


  public Integer getuId() {
    return uId;
  }

  public void setuId(Integer uId) {
    this.uId = uId;
  }

  public Integer getcId() {
    return cId;
  }

  public void setcId(Integer cId) {
    this.cId = cId;
  }
}

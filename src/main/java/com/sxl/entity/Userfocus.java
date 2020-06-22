package com.sxl.entity;


import java.io.Serializable;

public class Userfocus implements Serializable {

  private Integer userId;
  private Integer userFocusId;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getUserFocusId() {
    return userFocusId;
  }

  public void setUserFocusId(Integer userFocusId) {
    this.userFocusId = userFocusId;
  }
}

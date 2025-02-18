package com.example.vsm.dto;

import java.io.Serializable;

public class StageDto implements Serializable {
  private Integer id;
  private String code;
  private String name;
  private String status;
  private String number;

  public StageDto(Integer id, String code, String name, String status, String number) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.status = status;
    this.number = number;
  }

  protected StageDto() {}

  public Integer getId() {
    return id;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public String getStatus() {
    return status;
  }

  public String getNumber() {
    return number;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}

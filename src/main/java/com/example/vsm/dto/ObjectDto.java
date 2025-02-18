package com.example.vsm.dto;

import java.io.Serializable;

public class ObjectDto implements Serializable {
  private Integer id;
  private Integer typeId;

  public ObjectDto(Integer id, Integer typeId) {
    this.id = id;
    this.typeId = typeId;
  }

  protected ObjectDto() {}

  public Integer getId() {
    return id;
  }

  public Integer getTypeId() {
    return typeId;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }
}

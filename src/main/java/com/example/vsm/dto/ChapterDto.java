package com.example.vsm.dto;

import java.io.Serializable;
import java.util.Set;

public class ChapterDto implements Serializable {
  private Integer id;
  private String code;
  private String name;
  private String number;
  private Integer stageId;
  private Set<ObjectDto> objects;

  public ChapterDto(Integer id, String code, String name, String number, Integer stage, Set<ObjectDto> objects) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.number = number;
    this.stageId = stage;
    this.objects = objects;
  }

  protected ChapterDto() {}

  public Integer getId() {
    return id;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public String getNumber() {
    return number;
  }

  public Integer getStageId() {
    return stageId;
  }

  public Set<ObjectDto> getObjects() {
    return objects;
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

  public void setNumber(String number) {
    this.number = number;
  }

  public void setStageId(Integer stageId) {
    this.stageId = stageId;
  }

  public void setObjects(Set<ObjectDto> objects) {
    this.objects = objects;
  }
}

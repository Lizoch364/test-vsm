package com.example.vsm.dto;

import java.io.Serializable;
import java.util.Set;

public class SubDto implements Serializable{
  private Integer id;
  private String code;
  private String name;
  private String number;
  private Integer chapterId;
  private Set<Integer> objects;

  public SubDto(Integer id, String code, String name, String number, Integer chapterId, Set<Integer> objects) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.number = number;
    this.chapterId = chapterId;
    this.objects = objects;
  }

  protected SubDto() {}

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
  public Integer getChapterId() {
    return chapterId;
  }

  public Set<Integer> getObjects() {
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

  public void setChapterId(Integer chapterId) {
    this.chapterId = chapterId;
  }

  public void setObjects(Set<Integer> objects) {
    this.objects = objects;
  }
}

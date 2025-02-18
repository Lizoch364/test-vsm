package com.example.vsm.dto;

import java.io.Serializable;
import java.util.Set;

public class PartDto implements Serializable {
  private Integer id;
  private String code;
  private String name;
  private Integer year;
  private String developer;
  private String volume;
  private String number;
  private Integer subId;
  private Integer chapterId;
  private Set<ObjectDto> objects;

  public PartDto(Integer id, String code, String name, Integer year, String developer, String volume, String number, Integer subId, Integer chapterId, Set<ObjectDto> objects) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.year = year;
    this.developer = developer;
    this.volume = volume;
    this.number = number;
    this.subId = subId;
    this.chapterId = chapterId;
    this.objects = objects;
  }

  protected PartDto() {}

  public Integer getId() {
    return id;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public Integer getYear() {
    return year;
  }

  public String getDeveloper() {
    return developer;
  }

  public String getVolume() {
    return volume;
  }

  public String getNumber() {
    return number;
  }

  public Integer getSubId() {
    return subId;
  }

  public Integer getChapterId() {
    return chapterId;
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

  public void setYear(Integer year) {
    this.year = year;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setSubId(Integer subId) {
    this.subId = subId;
  }

  public void setChapterId(Integer chapterId) {
    this.chapterId = chapterId;
  }

  public void setObjects(Set<ObjectDto> objects) {
    this.objects = objects;
  }
}

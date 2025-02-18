package com.example.vsm.dto;

import java.io.Serializable;
import java.util.Set;

public class BookDto implements Serializable{
  private Integer id;
  private String code;
  private String name;
  private Integer year;
  private String developer;
  private String number;
  private Integer partId;
  private Set<Integer> objects;

  public BookDto(Integer id, String code, String name, Integer year, String developer, String number, Integer partId, Set<Integer> objects) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.year = year;
    this.developer = developer;
    this.number = number;
    this.partId = partId;
    this.objects = objects;
  }
	
  protected BookDto() {}

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

  public String getNumber() {
    return number;
  }

  public Integer getPartId() {
    return partId;
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

  public void setYear(Integer year) {
    this.year = year;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setPartId(Integer partId) {
    this.partId = partId;
  }

  public void setObjects(Set<Integer> objects) {
    this.objects = objects;
  }
}

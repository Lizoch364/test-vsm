package com.example.vsm.entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "part")
public class PartEntity extends BaseEntity {
  private String code;
  private String name;
  private Integer year;
  private String developer;
  private String volume;
  private String number;
  private SubEntity sub;
  private ChapterEntity chapter;
  private List<ObjectEntity> objects;

  public PartEntity(String code, String name, Integer year, String developer, String volume, String number, SubEntity sub, ChapterEntity chapter, List<ObjectEntity> objects){
    this.code = code;
    this.name = name;
    this.year = year;
    this.developer = developer;
    this.volume = volume;
    this.number = number;
    this.sub = sub;
    this.chapter = chapter;
    this.objects = objects;
  }

	protected PartEntity() {
    objects = new ArrayList<>();
  }

  @Column(name = "code")
  public String getCode() {
    return code;
  }

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @Column(name = "year")
  public Integer getYear() {
    return year;
  }

  @Column(name = "developer")
  public String getDeveloper() {
    return developer;
  }

  @Column(name = "volume")
  public String getVolume() {
    return volume;
  }

  @Column(name = "number")
  public String getNumber() {
    return number;
  }

  @ManyToOne
  @JoinColumn(name = "id_sub")
  public SubEntity getSub() {
    return sub;
  }

  @ManyToOne
  @JoinColumn(name = "id_chapter")
  public ChapterEntity getChapter() {
    return chapter;
  }

  @ManyToMany
  @JoinTable(name = "many_part_has_many_object",
    joinColumns = @JoinColumn(name = "id_part"),
    inverseJoinColumns = @JoinColumn(name = "id_object"))
  public List<ObjectEntity> getObjects() {
    return objects;
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
  public void setSub(SubEntity sub) {
    this.sub = sub;
  }
  public void setChapter(ChapterEntity chapter) {
    this.chapter = chapter;
  }

  public void setObjects(List<ObjectEntity> objects) {
    this.objects = objects;
  }
}

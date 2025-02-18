package com.example.vsm.entites;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "chapter")
public class ChapterEntity extends BaseEntity {
  private String code;
  private String name;
  private String number;
  private StageEntity stage;
  private Set<ObjectEntity> objects;

  public ChapterEntity(StageEntity stage, String code, String name, String number, Set<ObjectEntity> object){
    this.stage = stage;
    this.code = code;
    this.name = name;
    this.number = number;
    this.objects = object;
  }

  protected ChapterEntity() {}

  @Column(name = "code")
  public String getCode() {
    return code;
  }

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @Column(name = "number")
  public String getNumber() {
    return number;
  }

  @ManyToOne()
  @JoinColumn(name = "id_stage")
  public StageEntity getStage() {
    return stage;
  }

  @ManyToMany
  @JoinTable(name = "many_chapter_has_many_object",
    joinColumns = @JoinColumn(name = "id_chapter"),
    inverseJoinColumns = @JoinColumn(name = "id_object"))
  public Set<ObjectEntity> getObjects() {
    return objects;
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
  public void setStage(StageEntity stage) {
    this.stage = stage;
  }

  public void setObjects(Set<ObjectEntity> objects) {
    this.objects = objects;
  }
}

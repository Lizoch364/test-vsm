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
@Table(name = "book")
public class BookEntity extends BaseEntity {
  private String code;
  private String name;
  private Integer year;
  private String developer;
  private String number;
  private PartEntity part;
  private Set<ObjectEntity> objects;

  public BookEntity( PartEntity part, String code, String name, Integer year, String developer, String number, Set<ObjectEntity> objects){
    this.part = part;
    this.code = code;
    this.name = name;
    this.year = year;
    this.developer = developer;
    this.number = number;
    this.objects = objects;
  }

  protected BookEntity() {}

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

  @Column(name = "number")
  public String getNumber() {
    return number;
  }

  @ManyToOne
  @JoinColumn(name = "id_part")
  public PartEntity getPart() {
    return part;
  }

  @ManyToMany
  @JoinTable(name = "many_book_has_many_object",
    joinColumns = @JoinColumn(name = "id_book"),
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

  public void setYear(Integer year) {
    this.year = year;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setPart(PartEntity part) {
    this.part = part;
  }

  public void setObjects(Set<ObjectEntity> objects) {
    this.objects = objects;
  }
}

package com.example.vsm.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "type")
public class TypeEntity extends BaseEntity {
  private String name;

  public TypeEntity(String name) {
    this.name = name;
  }

  protected TypeEntity() {}

  @Column(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

package com.example.vsm.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
  private Integer id;

  @Id
  @Column(name = "id")
  public Integer getId() {
    return id;
  }

  protected void setId(Integer id) {
    this.id = id;
  }
}

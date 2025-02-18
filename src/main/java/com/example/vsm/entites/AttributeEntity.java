package com.example.vsm.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "attribute")
public class AttributeEntity extends BaseEntity {
  private String name;
  private TypeEntity type;

  public AttributeEntity(String name, TypeEntity type) {
    this.name = name;
    this.type = type;
  }

  protected AttributeEntity() {}

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @ManyToOne
  @JoinColumn(name = "id_type", nullable = false)
  public TypeEntity getType() {
    return type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(TypeEntity type) {
    this.type = type;
  }
}

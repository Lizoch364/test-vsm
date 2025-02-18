package com.example.vsm.entites;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "functional")
public class FunctionalEntity extends BaseEntity {
  private String name;
  private Set<ObjectEntity> objects;

  public FunctionalEntity(String name, Set<ObjectEntity> object) {
    this.name = name;
    this.objects = object;
  }

  protected FunctionalEntity() {}

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @ManyToMany
  @JoinTable(name = "many_functional_has_many_object",
    joinColumns = @JoinColumn(name = "id_functional"),
    inverseJoinColumns = @JoinColumn(name = "id_object"))
  public Set<ObjectEntity> getObjects() {
    return objects;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setObjects(Set<ObjectEntity> objects) {
    this.objects = objects;
  }
}

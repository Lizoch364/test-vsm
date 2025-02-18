package com.example.vsm.entites;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "region")
public class RegionEntity extends BaseEntity {
  private String name;
  private Set<ObjectEntity> objects;

  public RegionEntity(String name, Set<ObjectEntity> object) {
    this.name = name;
    this.objects = object;
  }

  protected RegionEntity() {}

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @ManyToMany
  @JoinTable(name = "many_region_has_many_object",
    joinColumns = @JoinColumn(name = "id_region"),
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

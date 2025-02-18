package com.example.vsm.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "property")
public class PropertyEntity extends BaseEntity {
  private String result;
  private ObjectEntity object;
  private AttributeEntity attribute;

  public PropertyEntity(String result, ObjectEntity object, AttributeEntity attribute) {
    this.result = result;
    this.object = object;
    this.attribute = attribute;
  }

  protected PropertyEntity() {}

  @Column(name = "result")
  public String getResult() {
    return result;
  }

  @ManyToOne
  @JoinColumn(name = "id_object", nullable = false)
  public ObjectEntity getObject() {
    return object;
  }

  @ManyToOne
  @JoinColumn(name = "id_attribute", nullable = false)
  public AttributeEntity getAttribute() {
    return attribute;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public void setObject(ObjectEntity object) {
    this.object = object;
  }

  public void setAttribute(AttributeEntity attribute) {
    this.attribute = attribute;
  }
}

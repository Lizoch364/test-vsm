package com.example.vsm.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "stage")
public class StageEntity extends BaseEntity {
  private String code;
  private String name;
  private String status;
  private String number;

  public StageEntity(String code, String name, String status, String number) {
    this.code = code;
    this.name = name;
    this.status = status;
    this.number = number;
  }

  protected StageEntity() {}

  @Column(name = "code")
  public String getCode() {
    return code;
  }

  @Column(name = "name")
  public String getName() {
    return name;
  }

  @Column(name = "status")
  public String getStatus() {
    return status;
  }

  @Column(name = "number")
  public String getNumber() {
    return number;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}

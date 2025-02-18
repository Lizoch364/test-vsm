package com.example.vsm.entites;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "object")
public class ObjectEntity extends BaseEntity {
  private TypeEntity type;
  private Set<BookEntity> books;
  private Set<ChapterEntity> chapters;
  private Set<FunctionalEntity> functions;
  private Set<PartEntity> parts;
  private Set<RegionEntity> regions;
  private Set<SubEntity> subs;

  public ObjectEntity(TypeEntity type, Set<BookEntity> books, Set<ChapterEntity> chapters, Set<FunctionalEntity> functions, Set<PartEntity> parts, Set<RegionEntity> regions, Set<SubEntity> subs) {
    this.type = type;
    this.books = books;
    this.chapters = chapters;
    this.functions = functions;
    this.parts = parts;
    this.regions = regions;
    this.subs = subs;
  }

  protected ObjectEntity() {}

  @ManyToOne
  @JoinColumn(name = "id_type", nullable = false)
  public TypeEntity getType() {
    return type;
  }

  @ManyToMany(mappedBy = "objects", fetch = FetchType.LAZY)
  public Set<BookEntity> getBooks() {
    return books;
  }

  @ManyToMany(mappedBy = "objects", fetch = FetchType.LAZY)
  public Set<ChapterEntity> getChapters() {
    return chapters;
  }

  @ManyToMany(mappedBy = "objects", fetch = FetchType.LAZY)
  public Set<FunctionalEntity> getFunctions() {
    return functions;
  }

  @ManyToMany(mappedBy = "objects", fetch = FetchType.LAZY)
  public Set<PartEntity> getParts() {
    return parts;
  }

  @ManyToMany(mappedBy = "objects", fetch = FetchType.LAZY)
  public Set<RegionEntity> getRegions() {
    return regions;
  }

  @ManyToMany(mappedBy = "objects", fetch = FetchType.LAZY)
  public Set<SubEntity> getSubs() {
    return subs;
  }


  public void setType(TypeEntity type) {
    this.type = type;
  }

  public void setBooks(Set<BookEntity> books) {
    this.books = books;
  }

  public void setChapters(Set<ChapterEntity> chapters) {
    this.chapters = chapters;
  }

  public void setFunctions(Set<FunctionalEntity> functions) {
    this.functions = functions;
  }

  public void setParts(Set<PartEntity> parts) {
    this.parts = parts;
  }

  public void setRegions(Set<RegionEntity> regions) {
    this.regions = regions;
  }

  public void setSubs(Set<SubEntity> subs) {
    this.subs = subs;
  }
}

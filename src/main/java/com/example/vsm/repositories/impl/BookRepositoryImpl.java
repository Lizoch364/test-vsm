package com.example.vsm.repositories.impl;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.BookEntity;
import com.example.vsm.repositories.BookRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class BookRepositoryImpl extends BaseRepositoryImpl<BookEntity> implements BookRepository {
  public BookRepositoryImpl() {
    super(BookEntity.class);
  }
}

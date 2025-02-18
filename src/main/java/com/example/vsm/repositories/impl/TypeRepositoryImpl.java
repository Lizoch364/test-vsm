package com.example.vsm.repositories.impl;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.TypeEntity;
import com.example.vsm.repositories.TypeRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class TypeRepositoryImpl extends BaseRepositoryImpl<TypeEntity> implements TypeRepository {
  public TypeRepositoryImpl() {
    super(TypeEntity.class);
  }
}

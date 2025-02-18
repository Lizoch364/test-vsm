package com.example.vsm.repositories.impl;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.AttributeEntity;
import com.example.vsm.repositories.AttributeRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class AttributeRepositoryImpl extends BaseRepositoryImpl<AttributeEntity> implements AttributeRepository {
  public AttributeRepositoryImpl() {
    super(AttributeEntity.class);
  }
}

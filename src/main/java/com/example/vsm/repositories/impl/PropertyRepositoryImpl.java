package com.example.vsm.repositories.impl;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.PropertyEntity;
import com.example.vsm.repositories.PropertyRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class PropertyRepositoryImpl extends BaseRepositoryImpl<PropertyEntity> implements PropertyRepository {
  public PropertyRepositoryImpl() {
    super(PropertyEntity.class);
  }
}

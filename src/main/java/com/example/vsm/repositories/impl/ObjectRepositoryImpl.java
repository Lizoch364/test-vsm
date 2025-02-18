package com.example.vsm.repositories.impl;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.ObjectEntity;
import com.example.vsm.repositories.ObjectRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class ObjectRepositoryImpl extends BaseRepositoryImpl<ObjectEntity> implements ObjectRepository {
  public ObjectRepositoryImpl() {
    super(ObjectEntity.class);
  }
}

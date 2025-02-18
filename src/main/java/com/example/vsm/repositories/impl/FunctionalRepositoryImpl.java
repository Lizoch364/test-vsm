package com.example.vsm.repositories.impl;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.FunctionalEntity;
import com.example.vsm.repositories.FunctionalRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class FunctionalRepositoryImpl extends BaseRepositoryImpl<FunctionalEntity> implements FunctionalRepository{
  public FunctionalRepositoryImpl() {
    super(FunctionalEntity.class);
  }
}

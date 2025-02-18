package com.example.vsm.repositories.impl;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.StageEntity;
import com.example.vsm.repositories.StageRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class StageRepositoryImpl extends BaseRepositoryImpl<StageEntity> implements StageRepository {
  public StageRepositoryImpl() {
    super(StageEntity.class);
  }
}

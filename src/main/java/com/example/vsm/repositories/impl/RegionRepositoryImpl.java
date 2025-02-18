package com.example.vsm.repositories.impl;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.RegionEntity;
import com.example.vsm.repositories.RegionRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class RegionRepositoryImpl extends BaseRepositoryImpl<RegionEntity> implements RegionRepository {
  public RegionRepositoryImpl() {
    super(RegionEntity.class);
  }
}

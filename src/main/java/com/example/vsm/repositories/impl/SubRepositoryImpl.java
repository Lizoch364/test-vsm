package com.example.vsm.repositories.impl;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.SubEntity;
import com.example.vsm.repositories.SubRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class SubRepositoryImpl extends BaseRepositoryImpl<SubEntity> implements SubRepository {
  public SubRepositoryImpl() {
    super(SubEntity.class);
  }
}

package com.example.vsm.repositories;

import java.util.List;

import com.example.vsm.entites.PartEntity;
import com.example.vsm.repositories.baseRepository.ReadRepository;

public interface PartRepository extends ReadRepository<PartEntity>{
  List<PartEntity> findPartByParam(Integer subId, Integer chapterId, Integer stageId);
  List<PartEntity> findAllByNotFilial();
}

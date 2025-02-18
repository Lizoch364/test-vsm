package com.example.vsm.repositories;

import java.util.List;

import com.example.vsm.entites.ChapterEntity;
import com.example.vsm.repositories.baseRepository.ReadRepository;

public interface ChapterRepository extends ReadRepository<ChapterEntity> {
  List<ChapterEntity> findChapterByStageId(Integer stageId);
  List<ChapterEntity> findAllByNextPart();
}

package com.example.vsm.repositories.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.ChapterEntity;
import com.example.vsm.repositories.ChapterRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class ChapterRepositoryImpl extends BaseRepositoryImpl<ChapterEntity> implements ChapterRepository {
  public ChapterRepositoryImpl() {
    super(ChapterEntity.class);
  }

  @Override
  public List<ChapterEntity> findChapterByStageId(Integer stageId) {
    return getEntityManager().createQuery("""
      select chapter from ChapterEntity chapter
      join chapter.stage stage
      where stage.id = :stage_id""",
			ChapterEntity.class)
			.setParameter("stage_id", stageId)
			.getResultList();
  }

  @Override
  public List<ChapterEntity> findAllByNextPart() {
    return getEntityManager().createQuery("""
      SELECT DISTINCT chapter FROM ChapterEntity chapter
      JOIN PartEntity part ON part.chapter = chapter
      WHERE part.sub IS NULL AND part.chapter IS NOT NULL""",
			ChapterEntity.class)
			.getResultList();
  }
}

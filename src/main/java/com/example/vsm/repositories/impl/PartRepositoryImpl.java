package com.example.vsm.repositories.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.vsm.entites.PartEntity;
import com.example.vsm.repositories.PartRepository;
import com.example.vsm.repositories.baseRepository.BaseRepositoryImpl;

@Repository
public class PartRepositoryImpl extends BaseRepositoryImpl<PartEntity> implements PartRepository {
  public PartRepositoryImpl() {
    super(PartEntity.class);
  }

  @Override
	public List<PartEntity> findPartByParam(Integer subId, Integer chapterId, Integer stageId) {
		return getEntityManager().createQuery("""
			SELECT p from PartEntity p
			INNER JOIN p.sub sub
			INNER JOIN sub.chapter chapter
			INNER JOIN chapter.stage stage
			WHERE
				stage.id = :stage_id
				AND chapter.id = :chapter_id
				AND sub.id = :sub_id""", PartEntity.class)
			.setParameter("sub_id", subId)
			.setParameter("chapter_id", chapterId)
			.setParameter("stage_id", stageId)
			.getResultList();
	}
  @Override
  public List<PartEntity> findAllByNotFilial() {
    return getEntityManager().createNativeQuery("""
      SELECT * FROM public.part part
      WHERE part.id NOT IN (
	      SELECT part.id FROM public.part part
	      INNER JOIN public.book book ON book.id_part = part.id
      )""", PartEntity.class)
    	.getResultList();
	}
}


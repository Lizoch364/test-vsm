package com.example.vsm.services.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.example.vsm.dto.ChapterDto;
import com.example.vsm.dto.ObjectDto;
import com.example.vsm.entites.ChapterEntity;
import com.example.vsm.entites.ObjectEntity;
import com.example.vsm.repositories.ChapterRepository;
import com.example.vsm.services.ChapterService;


@Service
@EnableCaching
public class ChapterServiceImpl implements ChapterService {
  private ChapterRepository chapterRepository;

  @Override
  @Cacheable(value = "charters", key = "'allChartersByNextPart'")
  public List<ChapterDto> findAllByNextPart() {
    return chapterRepository.findAllByNextPart().stream().map((chapter) -> mapToChapterDto(chapter)).toList();
  }

  @Autowired
  public void setChapterRepository(ChapterRepository chapterRepository) {
    this.chapterRepository = chapterRepository;
  }

  private ChapterDto mapToChapterDto(ChapterEntity chapter) {
     Set<ObjectDto> objectDto = new HashSet<ObjectDto>();

    for (ObjectEntity object : chapter.getObjects()) {
      objectDto.add(mapTObjectDto(object));
    }
    return new ChapterDto(
      chapter.getId(),
      chapter.getCode(),
      chapter.getName(),
      chapter.getNumber(),
      chapter.getStage().getId(),
      objectDto);
  }

    private ObjectDto mapTObjectDto(ObjectEntity object) {
    return new ObjectDto(
      object.getId(),
      object.getType().getId());
  }

}

package com.example.vsm.services.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import com.example.vsm.dto.ObjectDto;
import com.example.vsm.dto.PartDto;
import com.example.vsm.entites.ObjectEntity;
import com.example.vsm.entites.PartEntity;
import com.example.vsm.repositories.PartRepository;
import com.example.vsm.services.PartService;

@Service
@EnableCaching
public class PartServiceImpl implements PartService {
  private PartRepository partRepository;

  @Override
  @Cacheable(value = "partsParam", key = "'allPartsByParam'")
  public List<PartDto> findAllByParam(int subId, int chapterId, int stageId) {
    return partRepository.findPartByParam(subId, chapterId, stageId)
      .stream()
      .map(part -> mapToPartDto(part))
      .toList();
  }

  @Override
  @Cacheable(value = "partsNotFilial", key = "'allPartsByNotFilial'")
  public List<PartDto> findAllByNotFilial() {
    return partRepository.findAllByNotFilial()
      .stream()
      .map(part -> mapToPartDto(part))
      .toList();
  }

  @Autowired
  public void setPartRepository(PartRepository partRepository) {
    this.partRepository = partRepository;
  }

  private PartDto mapToPartDto(PartEntity part) {
    Set<ObjectDto> objectDto = new HashSet<ObjectDto>();

    for (ObjectEntity object : part.getObjects()) {
      objectDto.add(mapTObjectDto(object));
    }

    return new PartDto(
      part.getId(),
      part.getCode(), part.getName(),
      part.getYear(),
      part.getDeveloper(),
      part.getVolume(),
      part.getNumber(),
      part.getSub() != null ? part.getSub().getId() : null,
      part.getChapter() != null ? part.getChapter().getId() : null,
      objectDto
      );
  }

  private ObjectDto mapTObjectDto(ObjectEntity object) {
    return new ObjectDto(
      object.getId(),
      object.getType().getId());
  }
}

package com.example.vsm.services;

import java.util.List;

import com.example.vsm.dto.PartDto;

public interface PartService {
  List<PartDto> findAllByParam(int subId, int chapterId, int stageId);
  List<PartDto> findAllByNotFilial();
}

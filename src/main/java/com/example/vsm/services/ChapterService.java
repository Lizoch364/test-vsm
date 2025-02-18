package com.example.vsm.services;

import java.util.List;

import com.example.vsm.dto.ChapterDto;

public interface ChapterService {
  List<ChapterDto> findAllByNextPart();
}

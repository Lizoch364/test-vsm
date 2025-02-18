package com.example.vsm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vsm.dto.ChapterDto;
import com.example.vsm.services.ChapterService;

@RestController
@RequestMapping("/api/chapters")
public class ChapterController {
  private ChapterService chapterService;

  @GetMapping("/next-part")
  public List<ChapterDto> findAllByNextPart() {
    return chapterService.findAllByNextPart();
  }

  @Autowired
  public void setChapterService(ChapterService chapterService) {
    this.chapterService = chapterService;
  }
}

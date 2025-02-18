package com.example.vsm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vsm.dto.PartDto;
import com.example.vsm.services.PartService;

@RestController
@RequestMapping("/api/parts")
public class PartController {
  private PartService partService;

  @GetMapping("/by-param")
  public List<PartDto> findAllByParam(
    @RequestParam Integer subId,
    @RequestParam Integer chapterId,
    @RequestParam Integer stageId
  ) {
    return partService.findAllByParam(subId, chapterId, stageId);
  }

  @GetMapping("/not-filial")
  public List<PartDto> findAllByNotFilial() {
    return partService.findAllByNotFilial();
  }

  @Autowired
  public void setPartService(PartService partService) {
    this.partService = partService;
  }
}

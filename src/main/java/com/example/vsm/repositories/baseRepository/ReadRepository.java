package com.example.vsm.repositories.baseRepository;

import java.util.List;
import java.util.Optional;

public interface ReadRepository<T> {
  Optional<T> findById(int id);
  List<T> findAll();
}

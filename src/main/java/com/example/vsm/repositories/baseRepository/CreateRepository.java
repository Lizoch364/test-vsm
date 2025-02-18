package com.example.vsm.repositories.baseRepository;

public interface CreateRepository<T> {
  T save(T object);
}

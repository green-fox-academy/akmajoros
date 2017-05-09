package com.greenfoxacademy.todoWithH2.repository;

import com.greenfoxacademy.todoWithH2.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Todo, Long> {
}

package com.greenfoxacademy.todosql.repository;

import com.greenfoxacademy.todosql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Todo, Long> {
}

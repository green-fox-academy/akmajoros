package com.greenfoxacademy.todosql.repository;


import java.util.List;
import com.greenfoxacademy.todosql.model.Todo;
import org.springframework.data.repository.CrudRepository;


public interface Repository extends CrudRepository<Todo, Long> {

  List<Todo> findByIsDoneFalse();

}

package com.greenfoxacademy.listingtodos.repository;

import com.greenfoxacademy.listingtodos.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {

}

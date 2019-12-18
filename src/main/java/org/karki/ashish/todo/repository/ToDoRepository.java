package org.karki.ashish.todo.repository;

import org.karki.ashish.todo.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo, String> {
}

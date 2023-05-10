package com.ckyeon.springtutorial.todo;

import com.ckyeon.springtutorial.todo.dto.CreateRequest;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private final TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void create(CreateRequest dto) {
    Todo todo = dto.toEntity();
    todoRepository.save(todo);
  }
}

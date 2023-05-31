package com.ckyeon.springtutorial.todo;

import com.ckyeon.springtutorial.todo.dto.CreateRequest;
import com.ckyeon.springtutorial.todo.dto.TodoResponse;
import com.ckyeon.springtutorial.todo.dto.UpdateRequest;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TodoService {

  private final TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Transactional
  public void create(CreateRequest dto) {
    Todo todo = dto.toEntity();
    todoRepository.save(todo);
  }

  @Transactional(readOnly = true)
  public List<TodoResponse> findAll() {
    return todoRepository.findAll()
        .stream()
        .map(TodoResponse::fromEntity)
        .toList();
  }

  @Transactional
  public void update(Long id, UpdateRequest dto) {
    todoRepository.findById(id)
        .ifPresent((todo) -> todo.update(
            dto.getTitle(),
            dto.getBody(),
            dto.isDone()
        ));
  }

  @Transactional
  public void delete(Long id) {
    todoRepository.deleteById(id);
  }
}

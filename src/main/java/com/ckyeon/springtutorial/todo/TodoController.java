package com.ckyeon.springtutorial.todo;

import com.ckyeon.springtutorial.todo.dto.CreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

  private final TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @PostMapping("/todos")
  public ResponseEntity<Void> create(@RequestBody CreateRequest dto) {
    todoService.create(dto);
    return ResponseEntity.ok(null);
  }
}

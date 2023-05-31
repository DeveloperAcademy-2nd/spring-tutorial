package com.ckyeon.springtutorial.todo;

import com.ckyeon.springtutorial.todo.dto.CreateRequest;
import com.ckyeon.springtutorial.todo.dto.TodoResponse;
import com.ckyeon.springtutorial.todo.dto.UpdateRequest;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/todos")
  public ResponseEntity<List<TodoResponse>> findAll() {
    List<TodoResponse> todos = todoService.findAll();
    return ResponseEntity.ok(todos);
  }

  @PatchMapping("/todos/{id}")
  public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody UpdateRequest dto) {
    todoService.update(id, dto);
    return ResponseEntity.ok(null);
  }

  @DeleteMapping("/todos/{id}")
  public ResponseEntity<Void> deleteById(@PathVariable Long id) {
    todoService.delete(id);
    return ResponseEntity.ok(null);
  }
}

package com.ckyeon.springtutorial.todo.dto;

import com.ckyeon.springtutorial.todo.Todo;

public class TodoResponse {

  private Long id;

  private String title;

  private String body;

  private boolean done;

  public TodoResponse(Long id, String title, String body, boolean done) {
    this.id = id;
    this.title = title;
    this.body = body;
    this.done = done;
  }

  public static TodoResponse fromEntity(Todo todo) {
    return new TodoResponse(
        todo.getId(),
        todo.getTitle(),
        todo.getBody(),
        todo.isDone()
    );
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getBody() {
    return body;
  }

  public boolean isDone() {
    return done;
  }
}

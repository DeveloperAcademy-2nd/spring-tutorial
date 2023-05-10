package com.ckyeon.springtutorial.todo.dto;

import com.ckyeon.springtutorial.todo.Todo;

public class CreateRequest {

  private String title;

  private String body;

  protected CreateRequest() {
  }

  public CreateRequest(String title, String body) {
    this.title = title;
    this.body = body;
  }

  public Todo toEntity() {
    return new Todo(title, body);
  }

  public String getTitle() {
    return title;
  }

  public String getBody() {
    return body;
  }
}

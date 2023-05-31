package com.ckyeon.springtutorial.todo.dto;

public class UpdateRequest {

  private String title;

  private String body;

  private Boolean done;

  protected UpdateRequest() {}

  public UpdateRequest(String title, String body, Boolean done) {
    this.title = title;
    this.body = body;
    this.done = done;
  }

  public String getTitle() {
    return title;
  }

  public String getBody() {
    return body;
  }

  public Boolean isDone() {
    return done;
  }
}

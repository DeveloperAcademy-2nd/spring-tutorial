package com.ckyeon.springtutorial.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  private String body;

  private boolean done;

  protected Todo() {
  }

  public Todo(String title, String body) {
    this.title = title;
    this.body = body;
    this.done = false;
  }

  public void update(String title, String body, Boolean done) {
    if (title != null) {
      this.title = title;
    }

    if (body != null) {
      this.body = body;
    }

    if (done != null) {
      this.done = done;
    }
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

package com.greenfoxacademy.todoWithH2.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public Todo() {
  }

  public Todo(String title){
    this.title = title;
  }
}

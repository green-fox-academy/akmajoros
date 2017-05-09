package com.greenfoxacademy.todosql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "todos")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public Todo() {
  }

  public Todo(String title, boolean isDone, boolean isUrgent){
    this.title = title;
    this.isDone = isDone;
    this.isUrgent = isUrgent;

  }
}

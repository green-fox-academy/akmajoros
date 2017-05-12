package com.greenfox.akmajoros.reddit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String title;
  String href;
  Timestamp timestamp;
  long score;

  public void upVote(){
    score++;
  }

  public void downVote() {
    score--;
  }

}

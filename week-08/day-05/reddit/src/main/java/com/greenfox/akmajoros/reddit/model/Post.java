package com.greenfox.akmajoros.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by HorvathGy on 2017.05.12..
 */
@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String title;
  String href;

}

package com.greenfoxacademy.guardian.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Groot {

  String received;
  String translated;

  public Groot (String received){
    this.received = received;
    this.translated = "I am Groot!";
  }
}

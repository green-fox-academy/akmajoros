package com.greenfoxacademy.guardian.model;

import com.greenfoxacademy.guardian.service.GuardianInterface;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Groot implements GuardianInterface {

  String received;
  String translated;

  public Groot (String received){
    this.received = received;
    this.translated = "I am Groot!";
  }
}

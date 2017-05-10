package com.greenfoxacademy.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppendA {
  String appended;

  public AppendA(String input){
    this.appended = input + "a";
  }
}

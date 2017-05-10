package com.greenfoxacademy.restproject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeter {
  public Greeter(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  String welcome_message;
}

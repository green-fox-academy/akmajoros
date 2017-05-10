package com.greenfoxacademy.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeter {
  public Greeter(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + " my dear " + title + "!";
  }

  String welcome_message;
}

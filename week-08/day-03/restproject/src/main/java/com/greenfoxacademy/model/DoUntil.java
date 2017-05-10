package com.greenfoxacademy.model;

import lombok.Getter;
import lombok.Setter;

public class DoUntil {

  @Setter
  private int until;
  @Getter
  private int result;
  private String whatToDo;

  public void sum(){
    int sum  = 0;
    for (int i = 0; i <= until; i++) {
      sum += i;
    }
    result = sum;
  }

  public void factor(){
    int factor = 1;
    for (int i = 1; i <= until; i++ ) {
      factor *= i;
    }
    result = factor;
  }
}

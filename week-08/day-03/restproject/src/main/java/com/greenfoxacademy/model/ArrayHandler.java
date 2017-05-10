package com.greenfoxacademy.model;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {
  @Setter
  private String what;
  @Setter
  private List<Integer> numbers = new ArrayList<>();
  @Getter
  private List<Integer> result = new ArrayList<>();

  public void sum() {
    if (what.equals("sum")) {
      int sum = 0;
      for (int i = 0; i < numbers.size(); i++) {
        sum += numbers.get(i);
      }
      result.add(sum);
    }
  }

  public void multiply() {
    if (what.equals("multiply")) {
      int multiply = 1;
      for (int i = 0; i < numbers.size(); i++) {
        multiply *= numbers.get(i);
      }
      result.add(multiply);
    }
  }

  public void doubler() {
    if (what.equals("doubler")) {
      int toDouble = 2;
      for (int i = 0; i < numbers.size(); i++) {
        toDouble *= numbers.get(i);
        result.add(toDouble);
        toDouble = 2;
      }
    }
  }
}

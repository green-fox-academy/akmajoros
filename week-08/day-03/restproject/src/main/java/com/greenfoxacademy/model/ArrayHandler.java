package com.greenfoxacademy.model;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler implements RestMessageObject {
  @Setter
  private String what;
  @Setter
  private List<Integer> numbers = new ArrayList<>();
  private List<Integer> resultList = new ArrayList<>();
  @Getter
  private int result;

  public String whatGetter(){
    return what;
  }

  public void sum() {
    if (what.equals("sum")) {
      int sum = 0;
      for (int i = 0; i < numbers.size(); i++) {
        sum += numbers.get(i);
      }
      result = sum;
    }
  }

  public void multiply() {
    if (what.equals("multiply")) {
      int multiply = 1;
      for (int i = 0; i < numbers.size(); i++) {
        multiply *= numbers.get(i);
      }
      result = multiply;
    }
  }

  public ArrayHandler2 doubler() {
    if (what.equals("doubler")) {
      int toDouble = 2;
      for (int i = 0; i < numbers.size(); i++) {
        toDouble *= numbers.get(i);
        resultList.add(toDouble);
        toDouble = 2;
      }
    } return new ArrayHandler2(resultList);
  }
}

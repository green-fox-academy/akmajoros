package com.greenfoxacademy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler2 implements RestMessageObject {

  @Getter
  List<Integer> result;

  public ArrayHandler2(List<Integer> result) {
    this.result = result;
  }
}

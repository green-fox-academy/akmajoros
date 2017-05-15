package com.greenfoxacademy.guardian.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@NoArgsConstructor
public class Errorhandling implements GuardianInterface {
  String error;

  public Errorhandling(String error){
    this.error = error;
  }
}

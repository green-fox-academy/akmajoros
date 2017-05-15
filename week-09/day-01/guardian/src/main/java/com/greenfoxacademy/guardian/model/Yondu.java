package com.greenfoxacademy.guardian.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Yondu {
  double distance;
  double time;
  double speed;

  public Yondu(double distance, double time){
    this.distance = distance;
    this.time = time;
    this.distance = distance/time;
  }
}

package com.greenfoxacademy.guardian.model;

import com.greenfoxacademy.guardian.service.GuardianInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Yondu implements GuardianInterface {
  double distance;
  double time;
  double speed;

  public void setSpeed(){
    this.speed = distance/time;
  }
}

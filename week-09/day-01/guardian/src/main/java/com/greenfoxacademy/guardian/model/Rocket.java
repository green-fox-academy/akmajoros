package com.greenfoxacademy.guardian.model;


import com.greenfoxacademy.guardian.service.GuardianInterface;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Rocket implements GuardianInterface {
  int caliber25;
  int caliber30;
  int caliber50;
  String shipstatus = "empty";
  boolean ready;

  public void fillCargo(String received, double amount) {
    if(received == ".25") {
      caliber25 += amount;
    } else if (received == ".30") {
      caliber30 += amount;
    } else if (received == ".50") {
      caliber50 += amount;
    }
  }
}

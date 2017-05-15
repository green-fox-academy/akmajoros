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
    if(received.equals(".25")) {
      caliber25 += amount;
    } else if (received.equals(".30")) {
      caliber30 += amount;
    } else if (received.equals(".50")) {
      caliber50 += amount;
    }
  }

  public void setCargstatus() {
    double allAmmo = caliber25 + caliber30 + caliber50;
    double maxAmmo = 12500;
    double percentage = (allAmmo/maxAmmo)*100;
    if (allAmmo > 0 && allAmmo < maxAmmo) {
      this.shipstatus = (int) percentage + "%";
    } else if (allAmmo <= 0){
      this.shipstatus = "empty";
    } else if (allAmmo == maxAmmo) {
      this.shipstatus = "full";
    } else if (allAmmo > maxAmmo) {
      this.shipstatus = "overloaded";
    }
  }

  public void setReady() {
    this.ready = getShipstatus().equals("full");
  }
}

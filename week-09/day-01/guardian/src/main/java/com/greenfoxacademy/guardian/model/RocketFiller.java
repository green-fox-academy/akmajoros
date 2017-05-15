package com.greenfoxacademy.guardian.model;

import com.greenfoxacademy.guardian.service.GuardianInterface;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class RocketFiller implements GuardianInterface {
  @Setter
  String received;
  @Setter
  double amount;
  String shipstatus;
  boolean ready;

  public void setReady() {
    if (getShipstatus().equals("full")) {
      this.ready = true;
    } else {
      this.ready = false;
    }
  }

  public void setShipstatus(double amount){
    double maxAmmo = 12500;
    double percentage = (amount/maxAmmo)*100;
    if (this.amount > 0 && this.amount < maxAmmo) {
      this.shipstatus = (int) percentage + "%";
    } else if (amount <= 0){
      this.shipstatus = "empty";
    } else if (amount == maxAmmo) {
      this.shipstatus = "full";
    }
  }
}

package com.greenfoxacademy.guardian.controller;

import com.greenfoxacademy.guardian.model.Groot;
import com.greenfoxacademy.guardian.model.Rocket;
import com.greenfoxacademy.guardian.model.RocketFiller;
import com.greenfoxacademy.guardian.model.Yondu;
import com.greenfoxacademy.guardian.service.Errorhandling;
import com.greenfoxacademy.guardian.service.GuardianInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @Autowired
  Errorhandling errorhandling;
  @Autowired
  Yondu yondu;
  @Autowired
  Rocket rocket;
  @Autowired
  RocketFiller rocketFiller;

  @ExceptionHandler(value = MissingServletRequestParameterException.class)
  public Errorhandling missingRequestParam(){
    return new Errorhandling("I am Groot!");
  }

  @RequestMapping(value = "/groot")
  public GuardianInterface grootSpeak (@RequestParam(value = "message", required = true) String message) {
    if (message.length() == 0){
      return new Errorhandling("I am Groot!");
    }
    return new Groot(message);
  }

  @RequestMapping(value = "/yondu")
  public GuardianInterface arrowSpeedCalc(@RequestParam(value = "distance") Double distance,
                              @RequestParam(value = "time") Double time) {
    if(distance == null || time == null) {
      return new Errorhandling("No distance or no time provided");
    }
    yondu.setDistance(distance);
    yondu.setTime(time);
    yondu.setSpeed();
    return yondu;
  }

  @RequestMapping(value = "/rocket")
  public GuardianInterface showActualCargo(){
    return rocket;
  }

  @RequestMapping(value = "/rocket/fill")
  public GuardianInterface fillCargo(@RequestParam(value = "caliber") String caliber,
                                     @RequestParam(value = "amount") double amount){
    rocket.fillCargo(caliber, amount);
    rocket.setCargstatus();
    rocket.setReady();
    rocketFiller.setReceived(caliber);
    rocketFiller.setAmount(amount);
    rocketFiller.setShipstatus(amount);
    rocketFiller.setReady();
    return rocketFiller;
  }
}

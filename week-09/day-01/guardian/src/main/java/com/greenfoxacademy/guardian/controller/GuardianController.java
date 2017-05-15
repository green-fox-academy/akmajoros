package com.greenfoxacademy.guardian.controller;

import com.greenfoxacademy.guardian.model.Groot;
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
  public Yondu arrowSpeedCalc(@RequestParam(value = "distance") double distance,
                              @RequestParam(value = "time") double time) {
    return new Yondu();
  }
}

package com.greenfoxacademy.guardian.controller;

import com.greenfoxacademy.guardian.model.Groot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @RequestMapping(value = "/groot")
  public Groot grootSpeak (@RequestParam(value = "message") String message) {
    Groot groot = new Groot(message);
    return groot;
  }
}

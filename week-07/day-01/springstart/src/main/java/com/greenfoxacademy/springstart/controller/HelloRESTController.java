package com.greenfoxacademy.springstart.controller;


import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value="/greeting")
  public Greeting greeting(@RequestParam(value="name") String name) {
    Greeting greeting = new Greeting(1, name);
    return greeting;
  }
}

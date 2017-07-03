package com.greenfoxacademy.springstart.controller;


import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.StringJoiner;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  private static final String TEMPLATE = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value="/greeting")
  public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
  }
}

package com.greenfoxacademy.restproject;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String handleMissingInput(MissingServletRequestParameterException e) {
    return "Error: missing input parameter" + e.getMessage();
  }

  @GetMapping(value = "/doubling")
  public Doubling doubling(@RequestParam(value = "input") int input) {
    Doubling d = new Doubling(input, input*2);
    return d;
  }

  @GetMapping(value = "/greeter")
  public Greeter greeter(@RequestParam(value = "name") String name, @RequestParam(value = "title") String title) {
    Greeter greeter = new Greeter(name, title);
    return greeter;
  }

  @GetMapping(value = "/appenda/{appendable}")
  public AppendA appender(@RequestParam(value = "input") String input){
    AppendA appendA = new AppendA(input);
    return appendA;
  }
}

package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.AppendA;
import com.greenfoxacademy.model.Greeter;
import com.greenfoxacademy.model.DoUntil;
import com.greenfoxacademy.model.Doubling;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String handleMissingInput(MissingServletRequestParameterException e) {
    return "Error: missing input parameter" + e.getMessage();
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public String handleMissingInput(HttpMessageNotReadableException f) {
    return "Error: missing input parameter";
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
  public AppendA appender(@PathVariable(value = "appendable") String input){
    AppendA appendA = new AppendA(input);
    return appendA;
  }

  @PostMapping(value = "/dountil/{what}")
  public DoUntil doUntil(@RequestBody DoUntil doUntil, @PathVariable(value = "what") String whatToDo){
    if(whatToDo.equals("sum")) {
      doUntil.sum();
    } else if(whatToDo.equals("factor")) {
      doUntil.factor();
    }
    return doUntil;
  }
}

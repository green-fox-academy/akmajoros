package com.greenfoxacademy.todoWithH2.controller;

import com.greenfoxacademy.todoWithH2.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  Repository repository;

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todolist", repository.findAll());
    return "todolist";
  }
}

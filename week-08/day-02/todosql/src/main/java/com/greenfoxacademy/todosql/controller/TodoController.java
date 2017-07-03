package com.greenfoxacademy.todosql.controller;

import com.greenfoxacademy.todosql.model.Todo;
import com.greenfoxacademy.todosql.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  Repository repository;

  @RequestMapping(value = {"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if(isActive){
      model.addAttribute("todolist", repository.findAllByIsDoneFalse());
    } else {
      model.addAttribute("todolist", repository.findAll());
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String addTodo(Model model){
    model.addAttribute("todo", new Todo());
    return "addtodo";
  }

  @PostMapping("/add")
  public String saveTodo(Todo todo){
    repository.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String removeTodo(@PathVariable("id") long id){
    repository.delete(id);

    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable("id") long id, Model model){
    model.addAttribute("todo", repository.findOne(id));
    return "edittodo";
  }

  @PostMapping("/save")
  public String changeTodo(Model model, @RequestParam long id, String title, boolean isDone, boolean isUrgent){
    model.addAttribute("todo", repository.findOne(id));
    Todo todo = repository.findOne(id);
    todo.setTitle(title);
    todo.setDone(isDone);
    todo.setUrgent(isUrgent);
    repository.save(todo);
    return "redirect:/todo/list";
  }
}

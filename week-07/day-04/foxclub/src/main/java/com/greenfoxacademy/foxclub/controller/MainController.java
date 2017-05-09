package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Fox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @Autowired
  Fox fox;
  List<String> allTricks;

  public MainController() {
    this.allTricks = Arrays.asList("Write Java code", "Using Thymeleaf", "Using Spring", "Eat", "Sleep", "Rave", "Repeat", "Play the guitar");
  }

  @RequestMapping(value = "/")
  public ModelAndView infoPage(){
    ModelAndView m = new ModelAndView();
    m.addObject(fox);
    m.setViewName("index");
    return m;
  }

  @RequestMapping(value = "/nutritionstore")
  public ModelAndView nutritionStore(){
    ModelAndView m = new ModelAndView();
    m.setViewName("nutritionstore");
    return m;
  }

  @RequestMapping(value = "/trickcentre")
  public ModelAndView trickCentre(){
    ModelAndView m = new ModelAndView();
    m.addObject("allTricksList", allTricks);
    m.setViewName("trickcentre");
    return m;
  }

  /*private List<String> getRemainingBasicTricks(String[] listOfTricks) {
    List<String> returnList = new ArrayList<>();
    for (String trick : listOfTricks) {
      if (!fox.knowsTrick(trick)) {
        returnList.add(trick);
      }
    }
    return returnList;
  }*/

  @RequestMapping(value = "/addnutrition")
  public String addNutrition(@RequestParam String food, String drink){
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:";
  }

  @RequestMapping(value = "/addtrick")
  public String addTrick(@RequestParam String addTrick){
    fox.addTrick(addTrick);
    return "redirect:";
  }

}

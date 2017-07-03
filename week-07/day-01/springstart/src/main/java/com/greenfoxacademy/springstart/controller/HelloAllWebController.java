package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
public class HelloAllWebController {
  public static String[] HELLOS = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho",
          "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló",
          "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
          "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae",
          "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/helloall")
  public String greetingAll(@RequestParam(value="name", defaultValue="World") String name, Model model){
    model.addAttribute("name", name);
    List<String> shuffledHellos = Arrays.asList(HELLOS);
    Collections.shuffle(shuffledHellos);
    model.addAttribute("hellos", shuffledHellos);

    String[] randomHelloColors = fillWithRandomColors(HELLOS.length);
    model.addAttribute("color", randomHelloColors);

    String[] randomHelloSize = fillWithRandomSize(HELLOS.length);
    model.addAttribute("size", randomHelloSize);

    return "helloAll";
  }

  private String[] fillWithRandomSize(int numberOfSizes) {
    String[] sizes = new String[numberOfSizes];
    for (int i = 0; i < numberOfSizes; i++) {
      sizes[i] = generateRandomSize();
    }
    return sizes;
  }

  private String[] fillWithRandomColors(int numberOfColors) {
    String[] colors = new String[numberOfColors];
    for (int i = 0; i < numberOfColors; i++) {
      colors[i] = generateRandomColorRgb();
    }
    return colors;
  }

  private String generateRandomColorRgb() {
    String format = "rgb(%d,%d,%d)";
    int red = (int) (Math.random() * 201);
    int green = (int) (Math.random() * 201);
    int blue = (int) (Math.random() * 201);
    return String.format(format, red, green, blue);
  }

  private String generateRandomSize() {
    int size = 12 + (int) (Math.random() * 15);
    return String.format("%dpx", size);
  }

}

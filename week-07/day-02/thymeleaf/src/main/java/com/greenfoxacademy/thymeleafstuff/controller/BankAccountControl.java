package com.greenfoxacademy.thymeleafstuff.controller;

import com.greenfoxacademy.thymeleafstuff.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountControl {

  @RequestMapping(value = "/exercise1")
  public String accountData(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute(bankAccount);

    return "accountData";
  }
}

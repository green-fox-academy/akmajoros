package com.greenfoxacademy.thymeleafstuff.controller;

import java.util.ArrayList;
import java.util.List;

import com.greenfoxacademy.thymeleafstuff.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountControl {

  @RequestMapping("/exercise3")
  public String showAccountInfo(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", "2000", "lion");
    model.addAttribute(bankAccount);
    return "bank-account-info";
  }

  @RequestMapping("/exercise4")
  public String sanitizeInput(Model model) {
    String submittedText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

    model.addAttribute("submittedText", submittedText);
    return "index";
  }

  @RequestMapping("/exercise5")
  public String listBankAccounts(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Pumbaa", "0", "warthog"));
    bankAccountList.add(new BankAccount("Timon", "-200", "meerkat"));
    bankAccountList.add(new BankAccount("Rafiki", "500", "monkey"));
    bankAccountList.add(new BankAccount("Scar", "100000", "lion"));

    model.addAttribute(bankAccountList);

    return "accountlist";
  }

  @RequestMapping("/exercise6")
  public String listBankAccountsAndStats(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Pumbaa", "0", "warthog"));
    bankAccountList.add(new BankAccount("Timon", "-200", "meerkat"));
    bankAccountList.add(new BankAccount("Rafiki", "500", "monkey"));
    bankAccountList.add(new BankAccount("Scar", "100000", "lion"));

    model.addAttribute(bankAccountList);

    return "listandstat";
  }

  @RequestMapping("/exercise7")
  public String listBankAccountsAndStatsAndKing(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Pumbaa", "0", "warthog"));
    bankAccountList.add(new BankAccount("Timon", "-200", "meerkat"));
    bankAccountList.add(new BankAccount("Rafiki", "500", "monkey"));
    bankAccountList.add(new BankAccount("Scar", "100000", "lion", true));

    model.addAttribute(bankAccountList);

    return "liststatking";
  }

  @RequestMapping("/exercise8")
  public String listBankAccountsAndKingAndGoodman(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Pumbaa", "0", "warthog"));
    bankAccountList.add(new BankAccount("Timon", "-200", "meerkat"));
    bankAccountList.add(new BankAccount("Rafiki", "500", "monkey"));
    bankAccountList.add(new BankAccount("Scar", "100000", "lion", true));

    model.addAttribute(bankAccountList);

    return "liststatkinggood";
  }

}
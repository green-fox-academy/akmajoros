package com.greenfoxacademy.beanstart.config;

import com.greenfoxacademy.beanstart.color.RedColor;
import com.greenfoxacademy.beanstart.color.MyColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyColorConfig {

  @Bean
  public MyColor redColor(){
    return new RedColor();
  }
}

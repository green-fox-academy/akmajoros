package com.greenfoxacademy.beanstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanstartApplication {

	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext();

		SpringApplication.run(BeanstartApplication.class, args);
	}
}

package com.greenfoxacademy.todoWithH2;

import com.greenfoxacademy.todoWithH2.model.Todo;
import com.greenfoxacademy.todoWithH2.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoWithH2Application implements CommandLineRunner {

	@Autowired
	Repository repository;

	public static void main(String[] args) {
		SpringApplication.run(TodoWithH2Application.class, args);
	}

	@Override
	public void run(String...args) throws Exception {
		repository.save(new Todo("Start the day"));
		repository.save(new Todo("Finish H2 Workshop"));
		repository.save(new Todo("Finish JPA Workshop"));
		repository.save(new Todo("Create a CRUD project"));
    repository.save(new Todo("I have to learn Object Relational Mapping!"));
	}
}

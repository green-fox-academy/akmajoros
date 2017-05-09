package com.greenfoxacademy.beanstart;

import com.greenfoxacademy.beanstart.color.RedColor;
import com.greenfoxacademy.beanstart.config.MyColorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanstartApplication {

	public static void main(String[] args) {

		ApplicationContext factory = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		ApplicationContext colorFactory = new AnnotationConfigApplicationContext(MyColorConfig.class);

		HelloWorld hello = factory.getBean(HelloWorld.class);
		hello.setMessage("Hello World");
		hello.getMessage();

		RedColor redColor = colorFactory.getBean(RedColor.class);
		redColor.printColor();

		SpringApplication.run(BeanstartApplication.class, args);
	}
}

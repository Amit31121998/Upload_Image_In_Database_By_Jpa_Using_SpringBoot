package com.amit;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.amit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
	   UserService bean = ctx.getBean(UserService.class);
	   bean.saveData();
	}

}

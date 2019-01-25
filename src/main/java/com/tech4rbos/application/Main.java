package com.tech4rbos.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ({"com.tech4bros.controllers"})
public class Main {
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}

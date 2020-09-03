package com.example.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoProjApplication {
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring 2020";
	}

	//Main method to initiate the prog
	public static void main(String[] args) {
		SpringApplication.run(DemoProjApplication.class, args);
	}
	

}

package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}

@CrossOrigin(origins = "http://localhost:3000")
@RestController
class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "{"
			+ "\"id\": \"200107\","
			+ "\"name\": \"Abdullah Al Noman\","
			+ "\"email\": \"Nomanstine@gmail.com\","
			+ "\"phone\": \"01839743638\","
			+ "\"address\": \"MM Hall(215),JUST\","
			+ "\"subject\": \"CSE\""
			+ "}";
	}

}


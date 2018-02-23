package com.apress.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootHodongApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHodongApplication.class, args);
	}
}

class Greet {
	
	private String message;
	public Greet() {}
	public Greet(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

@RestController
class GreetingController {
	
	@GetMapping("/")
	Greet greet() {
		return new Greet("Hello World!");
	}
}

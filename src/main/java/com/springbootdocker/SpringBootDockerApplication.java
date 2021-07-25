package com.springbootdocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	@Value("${server.port:1010}")
	private String port;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}
	

	@GetMapping
	public String get() {
		return "Hello from Spring Boot -"+ port;
	}
	@GetMapping("/hello/{name}")
	public String getHello(@PathVariable("name") String name) {
		return "Hello "+ name;
	}
}

package com.cloud.Web.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebApplication {

	@GetMapping("/hello")
	public String helloWorld()
	{
		return "<h1>Hello World</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}

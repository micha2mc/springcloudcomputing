package com.zakado.zkd.cloud.springcloudcomputing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SpringCloudComputingApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "Welcome to course Cloud Computing UAH";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudComputingApplication.class, args);
	}

}

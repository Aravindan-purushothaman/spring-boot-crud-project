package com.practice.rest_api_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiPracticeApplication.class, args);
		System.out.println(greet());
	}
	public static String greet(){
		return "Hello World!";
	}

}

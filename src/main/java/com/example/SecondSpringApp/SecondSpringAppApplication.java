package com.example.SecondSpringApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondSpringAppApplication {

	private static final Logger logger = LoggerFactory.getLogger(SecondSpringAppApplication.class);

	public static void main(String[] args) {
		logger.info("Starting HelloWorldSpringRestApplication...");
		SpringApplication.run(SecondSpringAppApplication.class, args);
		logger.info("Application started successfully!");
	}
}

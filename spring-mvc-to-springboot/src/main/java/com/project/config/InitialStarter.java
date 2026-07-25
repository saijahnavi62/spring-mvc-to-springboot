package com.project.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.project")
public class InitialStarter {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(InitialStarter.class);
		springApplication.run(args);
		
	}
}

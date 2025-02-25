package com.EurekaExample1;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurwApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurwApplication.class, args);
	}

}

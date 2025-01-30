package com.example.demo;//this is the main package 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanAndLazy implements CommandLineRunner {
@Autowired
@Qualifier("first")
Cutter c;


	public static void main(String[] args) {
		SpringApplication.run(BeanAndLazy.class, args);
		System.out.println("Hello");
		System.out.println("Anjali Arya...You r best");
	}

	@Override
	public void run(String... args) throws Exception {
		this.c.cutting();
		
	}

}  

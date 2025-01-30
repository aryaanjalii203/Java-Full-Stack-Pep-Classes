package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TightlyCoupling implements CommandLineRunner {
	/*
	 * @Autowired
	 */Cutter c;
Cutter c1=new Cutter();

	public static void main(String[] args) {
		SpringApplication.run(TightlyCoupling.class, args);
		System.out.println("Hello");
		System.out.println("Anjali Arya...You r best");
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		this.c1.cutting();
		
	}

		
	}

  

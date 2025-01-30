package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import myPack.Cricketer;

@SpringBootApplication
public class ComponentScan implements CommandLineRunner {
@Autowired
@Qualifier("first")
Cutter c;
@Autowired
Player p;
@Autowired
AreaOfCircle a;
@Autowired
Cricketer ck;



	public static void main(String[] args) {
		SpringApplication.run(ComponentScan.class, args);
		System.out.println("Hello");
		System.out.println("Anjali Arya...You r best");
	}

	@Override
	public void run(String... args) throws Exception {
		this.c.cutting();
		this.p.display();
		this.a.setRadius(4);
		this.a.display();
		this.ck.getCrickInfo();
		
	}

}  

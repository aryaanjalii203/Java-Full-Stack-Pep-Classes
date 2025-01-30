package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages= {"myPack"})
public class Machine {
@Bean("first")
@Lazy
	public Cutter getCutter() {
	System.out.println("I am first bean method here.....");
	return new Cutter();
}
@Bean("second")
@Lazy
public Cutter useCutter() {
	System.out.println("Hello Guys...");
	return new Cutter();
}
@Bean("third")
@Lazy
public Cutter displayCutter() {
	System.out.println("I am second bean method here..........");
	return new Cutter();
}
}

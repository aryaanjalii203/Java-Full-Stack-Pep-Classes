package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AreaOfCircle {
	float radius=(float) 4;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void display() {
		System.out.println("Thsi is the area of Circle"+3.14*getRadius());
	}

}

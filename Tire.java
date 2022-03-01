package com.example.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class Tire {
	
	int radius,  milage;
	String color;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	public Tire(int radius, String color, int milage) {
//		this.radius = radius;
//		this.color = color;
//		this.milage = milage;
//	}
	public void getInfo() {
		System.out.println("Radius: "+radius+" Milage: "+milage+" Color: "+color);
	}

}

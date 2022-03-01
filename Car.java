package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Car {
	String model, color;
	int milage;
	@Autowired
	Engine engine;
	@Autowired
	Tire tire;
	
//	public Car(String model, int milage, String color) {
//		this.model = model;
//		this.milage = milage;
//		this.color = color;
//		}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public Engine getEngine() {
		return engine;
	}
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tire getTire() {
		return tire;
	}
	@Autowired
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void drive(int distance) {
		System.out.println("Driving the car for distance: "+distance);
		this.milage+= distance;
		System.out.println("Current Milage: "+milage);
	}
	
}

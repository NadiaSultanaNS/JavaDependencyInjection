package com.example.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class Engine {
	int age;
	int hrsPower;
	double zeroToSixty;
	
//	public Engine(int age, int hrsPower, double zeroToSixty) {
//		this.age = age;
//		this.hrsPower= hrsPower;
//		this.zeroToSixty = zeroToSixty;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHrsPower() {
		return hrsPower;
	}

	public void setHrsPower(int hrsPower) {
		this.hrsPower = hrsPower;
	}

	public double getZeroToSixty() {
		return zeroToSixty;
	}

	public void setZeroToSixty(double zeroToSixty) {
		this.zeroToSixty = zeroToSixty;
	}
	
	public void getInfo() {
		System.out.println("Age: "+age+" Horse Power: "+hrsPower+" ZeroToSixty: "+zeroToSixty);
	}
}

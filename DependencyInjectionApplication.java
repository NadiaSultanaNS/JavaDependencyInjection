package com.example.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DependencyInjectionApplication.class, args);
		
		Car car = context.getBean(Car.class);
		Engine engine = context.getBean(Engine.class);
		Tire tire = context.getBean(Tire.class);
		
		engine.setAge(0);
		engine.setHrsPower(100);
		engine.setZeroToSixty(30);
		
		tire.setRadius(20);
		tire.setColor("Black");
		tire.setMilage(1000000);
		
		car.setColor("White");
		car.setMilage(50000);
		car.setModel("Rav4");
		
		car.setEngine(engine);
		car.setTire(tire);
		
		car.getEngine().getInfo();
		car.getTire().getInfo();
		car.drive(100);
	}
	

}

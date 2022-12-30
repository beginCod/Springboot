package com.prc.vehicle.Vehicle.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@ComponentScan(basePackages = "com.prc.vehicle.fourwheeler")
@RestController
public class VehicleController {
	
@Autowired
	public com.prc.vehicle.fourwheeler.Car car;

@GetMapping("/currenttime")
	public LocalTime showTime() {
		return java.time.LocalTime.now();  		
	}

@GetMapping("/testcar")
	public String firEngineToCar() {
	System.out.println(this.car.getEngine().getEngineType());
		if(this.car.getEngine().getEngineType()!="Diesel") {
			return "Non diesel engine added to the car";
		}
		else {
			return "Diesel engine adde to add car.";
		}
	}
	

}

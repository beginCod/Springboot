package com.prc.vehicle.fourwheeler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.prc.vehicle.enginetypes.Engine;

@ComponentScan(basePackages = "com.prc.vehicle.enginetypes")
@Component
public class Car {

	@Autowired
	public Engine engine;

	public Engine getEngine() {
		return engine;
	}

	/*
	 * public void setEngine(Engine engine) { this.engine = engine; }
	 */
	
	
}

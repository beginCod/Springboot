package com.prc.vehicle.enginetypes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	@Value("Diesel")
	String engineType;
	
	/*
	 * public Engine(String engineType) { this.engineType = engineType; }
	 */

	public String getEngineType() {
		return engineType;
	}

	//Engine engine = new Engine("Diesel");
}

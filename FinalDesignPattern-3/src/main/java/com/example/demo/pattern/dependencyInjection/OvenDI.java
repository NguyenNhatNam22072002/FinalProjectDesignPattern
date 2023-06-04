package com.example.demo.pattern.dependencyInjection;

public class OvenDI {
	private int temperature;

	public OvenDI() {}
    public String preheat() {
        return "Preheating the oven...<br>" + setTemperature(200);
    }

    public String setTemperature(int temperature) {
        return "Setting oven temperature to " + temperature + " degrees Celsius";
    }

    public String bake(int minutes) {
        return "Baking for " + minutes + " minutes at " + temperature + " degrees Celsius";
	    }
}

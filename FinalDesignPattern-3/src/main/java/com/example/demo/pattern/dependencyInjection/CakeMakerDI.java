package com.example.demo.pattern.dependencyInjection;

public class CakeMakerDI {
	
	private final OvenDI oven;

    public CakeMakerDI (OvenDI oven) {
        this.oven = oven;
    }

    public String makeCake() {
    	StringBuilder sb = new StringBuilder();
        sb.append(oven.preheat()).append("<br>");
        sb.append("Mixing ingredients...<br>");
        sb.append("Pouring batter into the cake pan...<br>");
        sb.append(oven.setTemperature(180)).append("<br>");
        sb.append(oven.bake(30)).append("<br>");
        sb.append("Cake is ready!");

        return sb.toString();
    }
}

package com.example.demo.pattern.dependencyInjection;

public class CakeConfig {
    public CakeMakerDI cakeMakerDI() {
        return new CakeMakerDI(oven());
    }

    public OvenDI oven() {
        return new OvenDI();
    }
}
package com.example.demo.pattern.strategy;

public class MicrowaveBakingStrategy implements BakingStrategy {
    @Override
    public String bake() {
        return "Baking the cake using the microwave.";
        // Add logic for microwave baking
    }
}


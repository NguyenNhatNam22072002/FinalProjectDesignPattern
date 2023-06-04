package com.example.demo.pattern.strategy;

public class TraditionalBakingStrategy implements BakingStrategy {
    @Override
    public String bake() {
        return "Baking the cake using the traditional method.";
        // Add logic for traditional baking
    }
}


package com.example.demo.pattern.factory;

public class CakeFactory {
    public ICake createCake(String type) {
        if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateCake();
        } else if (type.equalsIgnoreCase("vanilla")) {
            return new VanillaCake();
        } else {
            throw new IllegalArgumentException("Invalid cake type: " + type);
        }
    }
}


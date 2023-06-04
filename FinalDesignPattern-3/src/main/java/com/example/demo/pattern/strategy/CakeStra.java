package com.example.demo.pattern.strategy;

public class CakeStra {
    private BakingStrategy bakingStrategy;

    public CakeStra(BakingStrategy bakingStrategy) {
        this.bakingStrategy = bakingStrategy;
    }

    public String bake() {
        return bakingStrategy.bake();
    }
}


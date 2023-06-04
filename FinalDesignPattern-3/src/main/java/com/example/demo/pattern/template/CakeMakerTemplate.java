package com.example.demo.pattern.template;

public abstract class CakeMakerTemplate {
	// Template method for making a cake
    public final String makeCake() {
        StringBuilder result = new StringBuilder();

        result.append(prepareIngredients());
        result.append(mixIngredients());
        result.append(bakeCake());
        result.append(decorateCake());

        return result.toString();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract String prepareIngredients();
    protected abstract String mixIngredients();
    protected abstract String bakeCake();
    protected abstract String decorateCake();
}

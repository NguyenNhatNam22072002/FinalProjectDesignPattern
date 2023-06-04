package com.example.demo.pattern.template;

public class VanillaCakeMaker extends CakeMakerTemplate {

    @Override
    protected String prepareIngredients() {
        return "Preparing ingredients for Vanilla cake.<br>";
        // Code for preparing ingredients specific to vanilla cake
    }

    @Override
    protected String mixIngredients() {
        return "Mixing ingredients for Vanilla cake.<br>";
        // Code for mixing ingredients specific to vanilla cake
    }

    @Override
    protected String bakeCake() {
        return "Baking Vanilla cake.<br>";
        // Code for baking a vanilla cake
    }

    @Override
    protected String decorateCake() {
        return "Decorating Vanilla cake.<br>";
        // Code for decorating a vanilla cake
    }
}

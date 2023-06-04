package com.example.demo.pattern.template;

public class ChocolateCakeMaker extends CakeMakerTemplate {

    @Override
    protected String prepareIngredients() {
        return "Preparing ingredients for Chocolate cake.<br>";
        // Code for preparing ingredients specific to chocolate cake
    }

    @Override
    protected String mixIngredients() {
        return "Mixing ingredients for Chocolate cake.<br>";
        // Code for mixing ingredients specific to chocolate cake
    }

    @Override
    protected String bakeCake() {
        return "Baking Chocolate cake.<br>";
        // Code for baking a chocolate cake
    }

    @Override
    protected String decorateCake() {
        return "Decorating Chocolate cake.<br>";
        // Code for decorating a chocolate cake
    }
}

package com.example.demo.pattern.decorator;

public abstract class CakeDecorator implements ICakeDecorator {
    protected ICakeDecorator cake;

    public CakeDecorator(ICakeDecorator cake) {
        this.cake = cake;
    }

    @Override
    public String decorate() {
        return cake.decorate();
    }
}


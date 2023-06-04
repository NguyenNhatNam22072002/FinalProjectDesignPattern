package com.example.demo.pattern.decorator;

public class CherryDecorator extends CakeDecorator {
    public CherryDecorator(ICakeDecorator cake) {
        super(cake);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with Cherries";
    }
}


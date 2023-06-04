package com.example.demo.pattern.decorator;

public class CreamDecorator extends CakeDecorator {
    public CreamDecorator(ICakeDecorator cake) {
        super(cake);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with Cream";
    }
}


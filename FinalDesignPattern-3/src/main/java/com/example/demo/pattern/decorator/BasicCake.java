package com.example.demo.pattern.decorator;

public class BasicCake implements ICakeDecorator {
    @Override
    public String decorate() {
        return "Basic Cake";
    }
}


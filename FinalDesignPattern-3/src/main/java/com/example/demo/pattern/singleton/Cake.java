package com.example.demo.pattern.singleton;

public class Cake {
    private String flavor;
    private String shape;

    public Cake(String flavor, String shape) {
        this.flavor = flavor;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Make a cake with " + flavor + " Flavor, "+ shape + " Shape";
    }
}
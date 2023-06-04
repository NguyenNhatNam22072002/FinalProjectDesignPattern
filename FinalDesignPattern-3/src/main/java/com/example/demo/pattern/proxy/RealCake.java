package com.example.demo.pattern.proxy;

public class RealCake implements ICakeProxy {
    @Override
    public String make() {
        return "Making a delicious cake!";
    }
}

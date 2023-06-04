package com.example.demo.pattern.proxy;

public class CakeMakerImpl implements ICakeMaker {
    private ICakeProxy cake;

    public CakeMakerImpl() {
        this.cake = new RealCake();
    }

    @Override
    public String makeCake() {
        String result = "Preparing ingredients...<br>";
        result += "Mixing the ingredients...<br>";
        result += cake.make() + "<br>";
        result += "Decorating the cake...<br>";
        result += "Cake is ready!";
        return result;
    }
}

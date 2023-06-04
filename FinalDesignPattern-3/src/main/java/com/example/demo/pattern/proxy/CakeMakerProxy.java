package com.example.demo.pattern.proxy;

public class CakeMakerProxy implements ICakeMaker {
    private ICakeMaker cakeMaker;

    public CakeMakerProxy() {
        this.cakeMaker = new CakeMakerImpl();
    }

    @Override
    public String makeCake() {
        String result = "CakeMakerProxy: Before making the cake...<br>";
        result += cakeMaker.makeCake() + "<br>";
        result += "CakeMakerProxy: After making the cake...";
        return result;
    }
}

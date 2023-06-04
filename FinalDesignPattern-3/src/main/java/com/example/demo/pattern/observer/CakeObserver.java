package com.example.demo.pattern.observer;

public class CakeObserver implements Observer {
    private String name;

    public CakeObserver(String name) {
        this.name = name;
    }

    @Override
    public String update(String cakeName) {
        return "Observer " + name + " received notification: A " + cakeName + " cake has been baked!";
    }

    @Override
    public String toString() {
        return name;
    }
}
package com.example.demo.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class CakeBaker implements Subject {
    private List<Observer> observers;
    private String cakeName;

    public CakeBaker() {
        this.observers = new ArrayList<>();
    }

    @Override
    public String registerObserver(Observer observer) {
        observers.add(observer);
        return "Observer " + observer + " registered successfully.";
    }

    @Override
    public String removeObserver(Observer observer) {
        boolean removed = observers.remove(observer);
        if (removed) {
            return "Observer " + observer + " removed successfully.";
        } else {
            return "Observer " + observer + " not found. Removal failed.";
        }
    }

    @Override
    public String notifyObservers(String cakeName) {
        StringBuilder notification = new StringBuilder();
        for (Observer observer : observers) {
            String update = observer.update(cakeName);
            notification.append(update).append("<br>");
        }
        return notification.toString();
    }

    public String bakeCake(String cakeName) {
        this.cakeName = cakeName;
        String bakeResult = "Baking a " + cakeName + " cake...";
        String notification = notifyObservers(cakeName);
        return bakeResult + "<br>" + notification;
    }
}
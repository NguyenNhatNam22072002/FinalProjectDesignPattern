package com.example.demo.pattern.observer;

public interface Subject {
    String registerObserver(Observer observer);
    String removeObserver(Observer observer);
    String notifyObservers(String cakeName);
}


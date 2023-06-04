package com.example.demo.pattern.facade;

public class CakeServiceImpl implements CakeService {
    @Override
    public String orderCake(String flavor, int quantity) {
        // Logic for ordering a cake
        return "Ordering " + quantity + " " + flavor + " cake(s)";
    }
}


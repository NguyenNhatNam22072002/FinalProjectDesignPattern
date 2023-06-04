package com.example.demo.pattern.facade;

public class CakeFacade {
    private CakeService cakeService;

    public CakeFacade() {
        this.cakeService = new CakeServiceImpl();
    }

    public String orderCake(String flavor, int quantity) {
        return cakeService.orderCake(flavor, quantity);
    }
}



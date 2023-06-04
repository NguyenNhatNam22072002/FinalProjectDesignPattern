package com.example.demo.pattern.singleton;

public class CakeMakerSin {
	
	private static CakeMakerSin instance;

    private CakeMakerSin() {
        // Private constructor to prevent instantiation
    }

    public static synchronized CakeMakerSin getInstance() {
        if (instance == null) {
            instance = new CakeMakerSin();
        }
        return instance;
    }

    public Cake makeCake(String flavor, String shape) {
        // Logic to make a cake
        return new Cake(flavor, shape);
    }
}

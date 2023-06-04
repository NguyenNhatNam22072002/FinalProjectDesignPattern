package com.example.demo.pattern.adapter;

public class MicrowaveAdapter implements Oven {
    private Microwave microwave;

    public MicrowaveAdapter(Microwave microwave) {
        this.microwave = microwave;
    }

    @Override
    public String preheat(int temperature) {
        microwave.setPowerLevel(10);
        return "Preheating microwave to " + temperature + " degrees";
    }

    @Override
    public String bake(String item) {
        microwave.cook(item);
        return "Baking " + item + " in the microwave";
    }
}
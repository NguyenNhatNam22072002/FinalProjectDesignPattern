package com.example.demo.pattern.adapter;

public class MicrowaveImpl implements Microwave {
    @Override
    public String setPowerLevel(int level) {
        return "Setting microwave power level to " + level;
    }

    @Override
    public String cook(String item) {
        return "Microwave is cooking " + item;
    }
}

package com.example.demo.pattern.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class CakeCOR {
	private List<String> steps = new ArrayList<>();

    public void addStep(String step) {
        steps.add(step);
    }

    public List<String> getSteps() {
        return steps;
    }
}

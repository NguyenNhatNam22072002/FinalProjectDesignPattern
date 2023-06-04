package com.example.demo.pattern.chainOfResponsibility;

public class BakingStep implements CakeStep {
    private CakeStep nextStep;

    @Override
    public void execute(CakeCOR cake) {
        // Code to bake the cake
        cake.addStep("Bake the cake");

        // Move to the next step
        if (nextStep != null) {
            nextStep.execute(cake);
        }
    }

    @Override
    public void setNextStep(CakeStep nextStep) {
        this.nextStep = nextStep;
    }
}
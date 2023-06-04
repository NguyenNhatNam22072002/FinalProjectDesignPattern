package com.example.demo.pattern.chainOfResponsibility;

public class FrostingStep implements CakeStep {
    private CakeStep nextStep;

    @Override
    public void execute(CakeCOR cake) {
        // Code to apply frosting
        cake.addStep("Apply frosting");

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

package com.example.demo.pattern.chainOfResponsibility;

//Concrete step: Prepare the batter
public class BatterPreparationStep implements CakeStep {
    private CakeStep nextStep;

    @Override
    public void execute(CakeCOR cake) {
        // Code to prepare the batter
        cake.addStep("Prepare the batter");

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
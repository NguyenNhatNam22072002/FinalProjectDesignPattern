package com.example.demo.pattern.chainOfResponsibility;

public class CakeMakerCOR {
	private CakeStep firstStep;

    public CakeMakerCOR() {
        // Build the chain of responsibility
        firstStep = new BatterPreparationStep();
        CakeStep bakingStep = new BakingStep();
        CakeStep frostingStep = new FrostingStep();

        firstStep.setNextStep(bakingStep);
        bakingStep.setNextStep(frostingStep);
    }

    public CakeCOR makeCake() {
    	CakeCOR cake = new CakeCOR();
        firstStep.execute(cake);
        return cake;
    }

}

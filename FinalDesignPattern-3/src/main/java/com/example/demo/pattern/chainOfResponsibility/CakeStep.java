package com.example.demo.pattern.chainOfResponsibility;

public interface CakeStep {
	void execute(CakeCOR cake);

	void setNextStep(CakeStep nextStep);
}

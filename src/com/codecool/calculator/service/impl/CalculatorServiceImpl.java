package com.codecool.calculator.service.impl;

import com.codecool.calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Float add(float a, float b) {
		return a + b;
	}

	@Override
	public Float subtract(float a, float b) {
		return a - b;
	}

	@Override
	public Float multiply(float a, float b) {
		return a * b;
	}

	@Override
	public Float division(float a, float b) {
		if (b == 0) {
			return null;
		}
		return a / b;
	}

}

package com.jadekearns.question2multimodule;

public class SubtractionOperatorModule implements CalculatorInputInterface {


    @Override
    public double input(double num1, double num2) {
        return (num1 - num2);
    }
}

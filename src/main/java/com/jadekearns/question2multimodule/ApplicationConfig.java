package com.jadekearns.question2multimodule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean(name = "addition")
    public CalculatorInputInterface getAddition(){return new AdditionOperatorModule();}

    @Bean (name = "subtraction")
    public CalculatorInputInterface getSubtraction(){return new SubtractionOperatorModule();}

    @Bean (name = "multiplication")
    public CalculatorInputInterface getMultiplication(){return new MultiplicationOperatorModule();}

    @Bean (name = "division")
    public CalculatorInputInterface getDivision(){return new DivisionOperatorModule();}
}

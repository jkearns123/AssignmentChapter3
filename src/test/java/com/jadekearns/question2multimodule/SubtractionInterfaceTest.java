package com.jadekearns.question2multimodule;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class SubtractionInterfaceTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    @Test
    public void subtractionTest1(){
        CalculatorInputInterface subtractionInterface = (CalculatorInputInterface) applicationContext.getBean("subtraction");
        double addResult = subtractionInterface.input(75,30);
        Assert.assertEquals(45,addResult,0.00);
    }

    @Test
    public void subtractionTest2(){
        CalculatorInputInterface subtractionInterface = (CalculatorInputInterface) applicationContext.getBean("subtraction");
        double addResult = subtractionInterface.input(0,1);
        Assert.assertEquals(-1,addResult,0.00);
    }

}
package com.jadekearns.question2multimodule;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class MultiplicationInterfaceTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    @Test
    public void multiplicationTest1(){
        CalculatorInputInterface multiplicationInterface = (CalculatorInputInterface) applicationContext.getBean("multiplication");
        double addResult = multiplicationInterface.input(75,30);
        Assert.assertEquals(2250,addResult,0.00);
    }

    @Test
    public void multiplicationTest2(){
        CalculatorInputInterface multiplicationInterface = (CalculatorInputInterface) applicationContext.getBean("multiplication");
        double addResult = multiplicationInterface.input(0,0);
        Assert.assertEquals(0.00,addResult,0.00);
    }

}
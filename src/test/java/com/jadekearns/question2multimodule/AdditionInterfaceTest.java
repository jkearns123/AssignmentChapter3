package com.jadekearns.question2multimodule;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class AdditionInterfaceTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    @Test
    public void additionTest1(){
        CalculatorInputInterface additionInterface = (CalculatorInputInterface) applicationContext.getBean("addition");
        double addResult = additionInterface.input(75,30);
        Assert.assertEquals(105,addResult,0.00);
    }
}
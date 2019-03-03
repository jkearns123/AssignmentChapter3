package com.jadekearns.question2multimodule;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class DivisionInterfaceTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    @Test
    public void divisionTest1(){
        CalculatorInputInterface divisionInterface = (CalculatorInputInterface) applicationContext.getBean("division");
        double addResult = divisionInterface.input(75,30);
        Assert.assertEquals(2.5,addResult,0.00);
    }

}
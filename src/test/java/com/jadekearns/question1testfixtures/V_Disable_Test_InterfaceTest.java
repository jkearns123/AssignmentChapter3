package com.jadekearns.question1testfixtures;

import com.jadekearns.question1testfixtures.V_Disable_Test_Interface;
import com.jadekearns.question1testfixtures.V_Disable_Test_Interface_Implementation;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class V_Disable_Test_InterfaceTest {

    @Test
    @Ignore//Ignore and Disabled is the same
    public void metricValues(){
        V_Disable_Test_Interface v_disable_test_interface = new V_Disable_Test_Interface_Implementation();
        double bmiResult = v_disable_test_interface.metricValue(75, 1.9);
        double myPi = 75 / (1.9*1.9);
        Assert.assertEquals(20.6,myPi,bmiResult);

    }

}
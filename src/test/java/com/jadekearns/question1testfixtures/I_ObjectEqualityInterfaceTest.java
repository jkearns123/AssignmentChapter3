package com.jadekearns.question1testfixtures;

import com.jadekearns.question1testfixtures.I_ObjectEqualityInterface;
import com.jadekearns.question1testfixtures.I_ObjectEqualityInterface_Implementation;
import org.junit.Assert;
import org.junit.Test;

public class I_ObjectEqualityInterfaceTest {

    @Test
    public void message(){
        I_ObjectEqualityInterface i_objectEqualityInterface = new I_ObjectEqualityInterface_Implementation();
        String result = i_objectEqualityInterface.message("Jade","Male");

        Assert.assertEquals("Jade is Male",result);
    }

}
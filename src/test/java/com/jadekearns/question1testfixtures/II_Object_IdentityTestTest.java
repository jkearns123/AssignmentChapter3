package com.jadekearns.question1testfixtures;

import org.hamcrest.collection.IsArrayContaining;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class II_Object_IdentityTestTest {

    @Test
    public void testObjectIdentity1(){


        II_Object_Identity_Interface ii_object_identity_interface = new II_Object_Identity_Interface_Implement();
        //int expected [] =new int[]{3,8};
        String expected[] = ii_object_identity_interface.addArr(new String[]{"Jade","Kearns"});
        Assert.assertThat(expected, IsArrayContaining.hasItemInArray("Jade"));

    }

}
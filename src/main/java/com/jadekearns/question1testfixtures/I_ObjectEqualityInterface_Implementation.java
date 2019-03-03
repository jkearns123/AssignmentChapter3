package com.jadekearns.question1testfixtures;

public class I_ObjectEqualityInterface_Implementation implements I_ObjectEqualityInterface {


    @Override
    public String message(String name, String gender) {
        return name + " is " + gender;
    }
}

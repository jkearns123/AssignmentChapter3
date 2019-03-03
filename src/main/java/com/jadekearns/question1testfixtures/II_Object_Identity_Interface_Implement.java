package com.jadekearns.question1testfixtures;

public class II_Object_Identity_Interface_Implement implements II_Object_Identity_Interface{


    @Override
    public String[] addArr(String[] num1) {
        int length = num1.length;
        String output[] = new String[length];

        for(int i = 0; i < length; i++){
            output[i] = num1[i];
        }
        return output;
    }
}

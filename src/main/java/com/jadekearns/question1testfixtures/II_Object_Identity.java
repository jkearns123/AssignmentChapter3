package com.jadekearns.question1testfixtures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class II_Object_Identity {

    public static void main( String[] args ){

        Scanner myScanner = new Scanner(System.in);
        String[] temp = new String[5];

        II_Object_Identity_Interface ii_object_identity_interface = new II_Object_Identity_Interface_Implement();

        //temp = ii_object_identity_interface.addArr(new String[]{"Jade","Adam", ""});


        for(int x = 0; x < temp.length; x++){
            System.out.println("Please Enter User Name: ");
            String userName = myScanner.nextLine();

            temp[x] = String.valueOf(ii_object_identity_interface.addArr(new String[]{userName}));
        }

        //System.out.println(temp);

        for(String elements:temp){
            System.out.println(elements);
        }


    }

}

package com.jadekearns.question2multimodule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main( String[] args ){



        double number1, number2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number \n");
        number1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /)");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter Second Number \n");
        number2 = scanner.nextDouble();

        scanner.close();
        double answer = 0;

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        switch(operator){
            case '+':
                CalculatorInputInterface additionInterface = (CalculatorInputInterface) applicationContext.getBean("addition");
                answer = additionInterface.input(number1,number2);

                break;

            case '-':
                CalculatorInputInterface subtractionInterface = (CalculatorInputInterface) applicationContext.getBean("subtraction");
                answer = subtractionInterface.input(number1,number2);

                break;

            case '*':
                CalculatorInputInterface multiplicationInterface = (CalculatorInputInterface) applicationContext.getBean("multiplication");
                answer = multiplicationInterface.input(number1,number2);
                break;

            case '/':
                CalculatorInputInterface divisionInterface = (CalculatorInputInterface) applicationContext.getBean("division");
                answer = divisionInterface.input(number1,number2);
                break;

                default:
                    System.out.printf("You have entered wrong operator");
        }

        System.out.println(number1 + " " + operator + " " + number2 + " = " + answer);



    }
}

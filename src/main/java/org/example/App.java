package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int num1 = 10;
        int num2 = 20;
        Calculator calculator = new Calculator();
        int result=calculator.add(num1,num2);
        System.out.println(result);
        System.out.println(calculator.substraction(num1,num2));
        System.out.println(calculator.multiplication(num1,num2));
        System.out.println(calculator.devision(num1,num2));


    }
}

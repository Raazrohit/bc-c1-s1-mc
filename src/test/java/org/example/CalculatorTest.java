package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    public Calculator calculatorTest;
    @Before
    public void setUp(){
        calculatorTest = new Calculator();
    }
    @Test
    public void testAdd(){
        int num1 = 10;
        int num2 = 20;
        int expected = 30;
        int result = calculatorTest.add(num1,num2);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void testSubstract(){
        int num1 = 10;
        int num2 = 20;
        int expected = -10;
        int result = calculatorTest.substraction(num1,num2);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void testMultiplication(){
        int num1 = 10;
        int num2 = 20;
        int expected = 200;
        int result = calculatorTest.multiplication(num1,num2);
        Assert.assertEquals(expected,result);
    }



}
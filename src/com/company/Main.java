package com.company;

import com.company.calculator.Calculator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b = 20;

        System.out.println("a + b = " + (a + b));
        System.out.println();

        Calculator calculator = new Calculator();

        int add = calculator.add(a, b);
        System.out.println(add);
        System.out.println("-----------------------");

        int subtract = calculator.subtract(a, b);
        System.out.println(subtract);
        System.out.println("-----------------------");

        int multiply = calculator.multiply(a, b);
        System.out.println(multiply);
        System.out.println("-----------------------");

        int divide = calculator.divide(a, b);
        System.out.println(divide);
        System.out.println("-----------------------");

    }
}

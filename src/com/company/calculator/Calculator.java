package com.company.calculator;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        int result = 0;

        if(num1 > num2){
            result = num1 - num2;
        } else{
            result = num2 - num1;
        }

        return result;
    }

    public int multiply(int num1, int num2){
        int result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2){
        int result = 0;

        if(num1 > num2){
            result = num1 / num2;
        } else{
            result = num2 / num1;
        }
        return result;
    }
}

package com.company.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("원하시는 연산을 하세요");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 1. 원하는 숫자를 입력하고 연산 기능을 결정하는 입력을 받는다

        while(true){
            System.out.println("어떤 연산을 하시겠습니까?");
            String input = sc.next();

            switch (input){
                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
                    break;

                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
                    break;

                case "*":
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
                    break;

                case "/":
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );
                    break;

                case "end":
                    sc.close();
                    return;

            }

        }

    } // main()
} // Calculator

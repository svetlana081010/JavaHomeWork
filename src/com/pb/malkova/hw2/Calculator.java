package com.pb.malkova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String sign;
        int result = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        operand1 = s.nextInt();

        System.out.print("Enter the second number: ");
        operand2 = s.nextInt();

        System.out.print("Enter the sign of the operation:");
        sign = s.next();

        switch (sign) {
            case "*": {
                result = operand1 * operand2;
                System.out.println("Result: " + result);
                break;
            }
            case "/": {
                if (operand2 == 0) {
                    System.out.println("Cannot be divided by 0. Try again");
                }
                result = operand1 / operand2;
                System.out.println("Result: " + result);
                break;
            }
            case "+": {
                result = operand1 + operand2;
                System.out.println("Result: " + result);
                break;
            }
            case "-": {
                result = operand1 - operand2;
                System.out.println("Result: " + result);
                break;
            }
            default: {
                System.out.println("You entered an invalid transaction character. Repeat one more time ");


            }
        }

    }

}

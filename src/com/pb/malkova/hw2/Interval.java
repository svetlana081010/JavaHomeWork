package com.pb.malkova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = s.nextInt();

        if (number >= 0 & number <= 14) {
            System.out.println("The number is in the range from 0 to 14");
        }
        if (number >= 15 & number <= 35) {
            System.out.println("The number is in the range from 15 to 35");
        }
        if (number >= 36 & number <= 50) {
            System.out.println("The number is in the range from 36 to 50");
        }
        if (number >= 51 & number <= 100) {
            System.out.println("The number is in the range from 51 to 100");
        }
        if (number < 0 || number > 100) {
            System.out.println("The entered number does not fall into one of the available gaps");
        }
    }
}

package com.pb.malkova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int count = 0;
        Random random = new Random();
        int hiddenNumber = random.nextInt(101);
        Scanner s = new Scanner(System.in);
        System.out.println("To exit the program enter - 'off'");
        System.out.println("We have chosen a number from 0 to 100. Try to guess it: ");

        for (; ; ) {
            count++;
            int userNumber = s.nextInt();
            if (userNumber != hiddenNumber) {
                if (userNumber > hiddenNumber) {
                    System.out.println("This number is greater than the one that was guessed. Try again");
                    continue;
                }
                if (userNumber < hiddenNumber) {
                    System.out.println("This number is less than the one guessed. Try again");
                    continue;

                }

            }
            if (userNumber == hiddenNumber) {
                System.out.println("Congratulations! You guessed it on " + count + " tries");
                break;
            }

        }

    }
}

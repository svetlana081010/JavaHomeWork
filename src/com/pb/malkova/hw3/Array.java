package com.pb.malkova.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        int count = 0;

        System.out.println("Fill the array with 10 integers separated by comma: ");
        String[] line = scanner.next().split("\\s*,\\s*", 10);
        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(line[i]);

        System.out.println("Filled array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(" ");
        System.out.println("Sum of array numbers = " + sum);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                count++;
        }
        System.out.println("Number of positive elements = " + count);


        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("Bubble sort: " + Arrays.toString(array));

    }
}

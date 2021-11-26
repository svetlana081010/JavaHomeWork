package com.pb.malkova.hw10;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int integerCount = 8;
        int floatCount = 9;
        NumBox<Integer> numbersInteger = new NumBox<>(integerCount);
        NumBox<Float> numbersFloat = new NumBox<>(floatCount);
        int maxIntValue = 2;
        float maxFloatValue = 4.F;
        Random random = new Random();

        try {
            while (true) {
                numbersInteger.add(random.nextInt(maxIntValue + 1));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Integers Array:");
        numbersInteger.print();

        System.out.println();
        try {
            for (int i = 0; i < floatCount - 2; i++) {
                numbersFloat.add(random.nextFloat() * maxFloatValue);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Floats Array:");
        numbersFloat.print();
        System.out.println();
    }
}

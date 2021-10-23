package com.pb.malkova.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static String userExpr(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter expression: ");
        String userExpr = s.nextLine();
        return userExpr;
    }

    public static String firstUpperCase(String userExpr) {
        if (userExpr == null || userExpr.isEmpty()) {
            return "Invalid expression";
        }
        String[] words = userExpr.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            output.append(Character.
                    toUpperCase(temp.charAt(0))).
                    append(temp.substring(1)).
                    append(" ");
        }
        return output.toString();
    }

    public static void main(String[] args) {

        System.out.println(firstUpperCase(userExpr()));
    }
}

package com.pb.malkova.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static String userExpr() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter expression: ");
        String userExpr = s.nextLine();
        return userExpr.toLowerCase();
    }

    private static String isAnagram(String first, String second) {

        if (first == null || second == null || first.equals("") || second.equals("")) {
            return "This is not anagram";
        }
        String answer = "";

        String st = first.replaceAll("[,. ]+", "");
        String nd = second.replaceAll("[,. ]+", "");

        if (st.equals("") || nd.equals("")) {
            return "This is not anagram";
        }

        char[] arraySt = st.toCharArray();
        char[] arrayNd = nd.toCharArray();
        Arrays.sort(arraySt);
        Arrays.sort(arrayNd);

        if (Arrays.equals(arraySt, arrayNd)) {
            answer = "This is anagram";
        } else {
            answer = "This is not anagram";
        }
        return answer;
    }

    public static void main(String[] args) {
        String str1 = userExpr();
        String str2 = userExpr();
        System.out.println(isAnagram(str1, str2));
    }
}

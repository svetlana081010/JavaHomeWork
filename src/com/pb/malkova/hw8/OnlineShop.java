package com.pb.malkova.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        String login1;
        String password1;
        String confirmPassword1;
        boolean registr = false;
        Auth auth = new Auth();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Register.\nEnter login:");
        login1 = scanner.next();
        System.out.println("Enter password:");
        password1 = scanner.next();
        System.out.println("Enter confirmPassword:");
        confirmPassword1 = scanner.next();
        try {
            auth.signUp(login1, password1, confirmPassword1);
            registr = true;
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (WrongPasswordException e2) {
            System.out.println(e2.getMessage());
            e2.printStackTrace();
        }
        System.out.println("---------------------------");
        if (registr == true) {
            System.out.println("Please log in to the system.\nEnter login:");
            login1 = scanner.next();
            System.out.println("Enter password:");
            password1 = scanner.next();
            try {
                auth.signIn(login1, password1);
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }
    }
}

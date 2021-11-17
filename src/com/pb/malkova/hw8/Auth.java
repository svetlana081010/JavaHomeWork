package com.pb.malkova.hw8;

public class Auth {
    static String login;
    private static String password;

    public void signUp(String loginNew, String passwordNew, String confirmPasswordNew)
            throws WrongLoginException,
            WrongPasswordException {

        String patLogin = "([a-zA-Z0-9]{5,20})";
        String patPassword = "([a-zA-Z_0-9]{5,})";

        if (loginNew.matches(patLogin)) {
            login = loginNew;
        } else {
            throw new WrongLoginException("You entered an incorrect login. Try again");
        }

        if (passwordNew.matches(patPassword) && passwordNew.equals(confirmPasswordNew)) {
            password = passwordNew;
            System.out.println("Registration completed successfully!");
        } else {
            throw new WrongPasswordException("Your password does not meet the requirements. Try again");
        }
    }

    public void signIn(String loginNew, String passwordNew) throws WrongLoginException {
        if (loginNew.equals(login) & passwordNew.equals(password)) {
            System.out.println("Authorization was successful!");
        } else {
            throw new WrongLoginException("You entered an incorrect login. Try again");
        }
    }
}

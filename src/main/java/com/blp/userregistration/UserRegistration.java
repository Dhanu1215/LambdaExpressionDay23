package com.blp.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User registration program using lambda expression.
 */
@FunctionalInterface
interface PasswordRule2 {
    void validUser(String password);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        PasswordRule2 fn = (password) -> {
            boolean check = Pattern.matches("^([A-Z]+[a-z0-9@#$*]{6}[0-9]+)$", password);
            if (check == true) {
                System.out.println("Password is Valid");
            } else
                System.out.println("Enter valid password");
        };
        fn.validUser("Dhanu@12");
    }
}

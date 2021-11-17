package com.blp.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User registration program using lambda expression.
 */
@FunctionalInterface
interface PasswordRule4 {
    void validUser(String password);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        PasswordRule4 fn = (password) -> {
            boolean check = Pattern.matches("^([A-Z]{1,}[a-z]{4}[@#$|]{1}[0-9]{1,})$", password);
            if (check == true) {
                System.out.println("Password is Valid");
            } else
                System.out.println("Enter valid password");
        };
        fn.validUser("Dhanu@12");
    }
}

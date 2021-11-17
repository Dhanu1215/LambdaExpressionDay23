package com.blp.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User registration program using lambda expression.
 */
@FunctionalInterface
interface firstname {
    void validUser(String name);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        firstname fn = (name)->{
            boolean check = Pattern.matches("([A-Z][a-z]{3,})",name);
            if (check == true) {
                System.out.println("Firstname is Valid");
            }else
                System.out.println("Enter valid name");
        };
        fn.validUser("Dhanashree");
    }
}

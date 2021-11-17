package com.blp.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User registration program using lambda expression.
 */
@FunctionalInterface
interface EmailId {
    void validUser(String email);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        EmailId fn = (email)->{
            boolean check = Pattern.matches("^([a-z]{3}[.][a-z]{3}@[a-z]{2}[.][a-z]{2}[.][a-z]{2})$",email);
            if (check == true) {
                System.out.println("Email is Valid");
            }else
                System.out.println("Enter valid email");
        };
        fn.validUser("abc.xyz@bl.co.in");
    }
}

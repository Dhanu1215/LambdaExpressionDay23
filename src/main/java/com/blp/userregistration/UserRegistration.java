package com.blp.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User registration program using lambda expression.
 */
@FunctionalInterface
interface MobileNumber {
    void validUser(String mobileNumber);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        MobileNumber fn = (mobileNumber)->{
            boolean check = Pattern.matches("^([91]{2} [0-9]{10})$",mobileNumber);
            if (check == true) {
                System.out.println("Mobile number is Valid");
            }else
                System.out.println("Enter valid mobile number");
        };
        fn.validUser("91 8421731310");
    }
}

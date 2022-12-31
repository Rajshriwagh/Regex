package com.regex;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * (UC-10_JUnit)
 Write JUnit Test to validate the User Entry for First Name, Last Name, Email, Mobile, and Password.
 - Write junit Test for Happy as well as Sad test case.
 - Happy Test Case validates the Entry Successfully
 - Sad Test Cases fails the Entry */

public class UserRegistrationForm {
	static boolean Name(String str1){
        boolean b1 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str1).matches();
        return b1;
    }

    static boolean Last(String str2){
        boolean b2 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str2).matches();
        return b2;
    }

    static boolean Email(String str3){
        boolean b3 = Pattern.compile("^[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$").matcher(str3).matches();
        return b3;
    }

    static boolean Phone(String str4){
        boolean b4 = Pattern.compile("^(91)[ ]{1}[1-9]{1}[0-9]{9}$").matcher(str4).matches();
        return b4;
    }
    static boolean Password(String str5){
        boolean b5 = Pattern.compile("^[0-9]{1,}[!@#$%^&]{1,}[A-z]{1,}[a-zA-Z0-9]{5,}$").matcher(str5).matches();
        return b5;
    }
}
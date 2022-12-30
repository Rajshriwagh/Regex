package com.regex;

import java.util.Scanner;

import java.util.regex.Pattern;

public class RegexEx {

	public static void main( String[] args )
    {
		System.out.println( "Welcome to User Registration!!!" );

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your First Name: ");
        String firstName=sc.next();
        boolean res= Pattern.matches("^[A-Z][A-Za-z]{2,}$", firstName);
        if(res) {
            System.out.println("You have entered valid First Name");
        }else {
            System.out.println("Sorry! you have entered invalid First Name");
        }

        System.out.println("Please enter your Last Name: ");
        String lastName = sc.next();
        boolean res1 = Pattern.matches("^[A-Z][A-Za-z]{2,}$", lastName);
        if (res1) {
            System.out.println(" You have entered valid Last Name");
        } else {
            System.out.println("Sorry! you have entered invalid Last Name");
        }

        System.out.println("Please enter your Email Address: ");
        String email = sc.next();
        String emailPattern="^[a-z0-9]{3,}[+.-]?[a-z0-9]{0,}[@]{1,}[a-z0-9]{1,}[.]{1,}([a-z]{0,}[.]{0,})[a-z]{2,}$";
        boolean emailCheck = Pattern.matches(emailPattern, email);
        if (emailCheck) {
            System.out.println("You have entered valid Email Address");
        } else {
            System.out.println("Sorry! you have entered invalid Email Address");
        }

        System.out.println("Please enter your Mobile Number: ");
        String mobileNumber = sc.next();
      
        String mobileNumberPattern="^[+91]{3,} [0-9]{10}$";
        boolean mnCheck = Pattern.matches(mobileNumberPattern, mobileNumber);
        if (mnCheck) {
            System.out.println("You have entered valid Mobile Number");
        } else {
            System.out.println("Sorry! you have entered invalid Mobile Number");
        }
        
      //UC7: Password with the rule of minimum 1 number in the password
        System.out.println("Please enter your Password: ");
        String password = sc.next();
        String passwordPattern="^(?=.*[0-9])(?=.*[A-Z])([A-Za-z0-9]){8,}$";
        boolean passwordCheck = Pattern.matches(passwordPattern,password);
        if (passwordCheck) {
            System.out.println("You have entered valid Password");
        } else {
            System.out.println("Sorry! you have entered invalid Password");
        }
    }
}
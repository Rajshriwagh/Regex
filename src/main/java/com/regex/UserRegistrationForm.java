package com.regex;
import java.util.Scanner;
import java.util.regex.Pattern;


public class UserRegistrationForm {

	    public boolean checkPassword(String password) {
	        
	    	String passwordPattern = "^[0-9]{1,}[!@#$%^&]{1,}[A-z]{1,}[a-zA-Z0-9]{5,}$";
            boolean passwordChk = Pattern.matches(passwordPattern,password);
            if (passwordChk) {
                System.out.println("You have entered valid Password");
            } else {
                System.out.println("Entered Password is invalid ");
            }
            return passwordChk;

        }
	    

	    public boolean checkMobileNumber(String mobileNumber) {
	        // UC4: Mobile Number
	        String mobileNumberPattern = "^[+91]{3,}[ ][0-9]{10}$";
	        boolean mnCheck = Pattern.matches(mobileNumberPattern, mobileNumber);
	        if (mnCheck) {
	            System.out.println("You have entered valid Mobile Number");
	        } else {
	            System.out.println("Sorry! you have entered invalid Mobile Number");
	        }
	        return mnCheck;
	    }

	    public boolean checkEmailAddress(String email) {
	        // UC3: Email
	        String emailPattern = "^[a-z0-9]{3,}[+.-]?[a-z0-9]{0,}[@]{1,}[a-z0-9]{1,}[.]{1,}([a-z]{0,}[.]{0,})[a-z]{2,}$";
	        /*
	         * UC9:Email Sample to check abc@yahoo.com abc-100@yahoo.com abc.100@yahoo.com
	         * abc111@abc.com abc-100@abc.net abc.100@abc.com.au abc@1.com abc@gmail.co
	         * abc+100@gmail.com
	         */
	        boolean emailCheck = Pattern.matches(emailPattern, email);
	        if (emailCheck) {
	            System.out.println("You have entered valid Email Address");
	        } else {
	            System.out.println("Sorry! you have entered invalid Email Address");
	        }
	        return emailCheck;

	    }

	    public boolean checkLastName(String lastName) {
	        // UC2:Last Name
	        boolean lastNameCheck = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
	        if (lastNameCheck) {
	            System.out.println("You have entered valid Last Name");
	        } else {
	            System.out.println("Sorry! you have entered invalid Last Name");
	        }
	        return lastNameCheck;

	    }

	    public static boolean checkFirstName(String firstName) {
	        // UC1:First Name
	        boolean res = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
	        if (res) {
	            System.out.println("You have entered valid First Name");
	        } else {
	            System.out.println("Sorry! you have entered invalid First Name");
	        }
	        return res;

	    }
	}
package com.regex;
import java.util.Scanner;
import java.util.regex.Pattern;


public class UserRegistrationForm {

	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    	
        System.out.println("Welcome to User Registration program");
        UserRegistrationForm urf = new UserRegistrationForm();
        System.out.println("Please enter your First Name: ");
        String firstName = sc.nextLine();
        urf.checkFirstName(firstName);

        System.out.println("Please enter your Last Name: ");
        String lastName = sc.nextLine();
        urf.checkLastName(lastName);

        System.out.println("Please enter your Email Address: ");
        String email = sc.nextLine();
        urf.checkEmailAddress(email);

        System.out.println("Please enter your Mobile Number: ");
        String mobileNumber = sc.nextLine();
        urf.checkMobileNumber(mobileNumber);

        System.out.println("Please enter your Password: ");
        String password = sc.nextLine();
        urf.checkPassword(password);
        System.out.println("Thank you for using Registering user!");
        sc.close();
    }

    public boolean checkPassword(String password) {
        String passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[~!@#$%^&*()<>:{},.;'])([A-Za-z0-9~!@#$%^&*()<>:{},.;']){8,}$";
        boolean passwordCheck = Pattern.matches(passwordPattern, password);
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))
                    && !Character.isWhitespace(password.charAt(i))) {
                count++;
            }
        }
        boolean flag=false;

        if (passwordCheck) {
            if (count == 0 || count > 1) {
                System.out.println("Sorry! you have entered invalid Password");

            } else {
                flag=true;
                System.out.println("You have entered valid Password");
            }
        } else {
            try {
                throw new InvalidUserDetailsException("Invalid Password");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
                System.out.println("Wrong Test");
            }
        }
        return flag;

    }

    public boolean checkMobileNumber(String mobileNumber) {
        // UC4: Mobile Number
        String mobileNumberPattern = "^[+91]{3,}[ ][0-9]{10}$";
        boolean mnCheck = Pattern.matches(mobileNumberPattern, mobileNumber);
        if (mnCheck) {
            System.out.println("You have entered valid Mobile Number");
        } else {
            try {
                throw new InvalidUserDetailsException("Invalid Mobile Number");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
                System.out.println("Wrong Test");
            }
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
            try {
                throw new InvalidUserDetailsException("Invalid Email");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
                System.out.println("Wrong Test");
            }
        }
        return emailCheck;

    }

    public boolean checkLastName(String lastName) {
        // UC2:Last Name
        boolean lastNameCheck = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
        if (lastNameCheck) {
            System.out.println("You have entered valid Last Name");
        } else {
            try {
                throw new InvalidUserDetailsException("Invalid Name");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
                System.out.println("Wrong Test");
            }
        }
        return lastNameCheck;

    }

    public static boolean checkFirstName(String firstName) {
        // UC1:First Name
        boolean res = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
        if (res) {
            System.out.println("You have entered valid First Name");
        } else {
            try {
                throw new InvalidUserDetailsException("Invalid Name");
            } catch (InvalidUserDetailsException e) {
                e.printStackTrace();
                System.out.println("Wrong Test");
            }
        }
        return res;
    }
}
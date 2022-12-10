package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern pat1 = Pattern.compile("^[A-Z][a-z]{2,}");
		System.out.println("Enter first name starts with Cap and has minimum 3 characters : ");
		String firstname = sc.next();
		Matcher mf = pat1.matcher(firstname);

		if (mf.matches())
			System.out.println("You have entered valid first name!");
		else
			System.out.println("You have entered invalid first name!");

		System.out.println("Enter last name starts with Cap and has minimum 3 characters : ");
		String lastname = sc.next();
		Pattern pt2 = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher ml = pat1.matcher(firstname);

		if (ml.matches())
			System.out.println("You have entered valid last name!");
		else
			System.out.println("You have entered invalid last name!");

		System.out.println("Enter your email");
		String email = sc.next();
		Pattern pt3 = Pattern.compile("^[a-z]{3,}([.][a-z]{3,})?[@][a-z]{2,}[.]co([.]in)?$");
		Matcher mail = pt3.matcher(email);

		if (mail.matches())
			System.out.println("You have entered Valid email!");
		else
			System.out.println("You have entered Invalid email!");

		System.out.println("Enter your Mobile Number: ");
        String mobileNumber = sc.next();
        String pt4="^(91)[ ]{1}[1-9]{1}[0-9]{9}$";
        boolean mn = Pattern.matches(pt4, mobileNumber);
        if (mn) {
            System.out.println("You have entered valid Mobile Number");
        } else {
            System.out.println("You have entered invalid Mobile Number");
        }
	}

}

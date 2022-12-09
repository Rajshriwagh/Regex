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
	}

}

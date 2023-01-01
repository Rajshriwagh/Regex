package com.regex;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultipleEmails {
	boolean expected;
	String input;

	public MultipleEmails(boolean expected, String input) {
		this.expected = expected;
		this.input = input;
	}

	@Test
	public void emailTest() {
		UserRegistrationForm form = new UserRegistrationForm();
		Assert.assertEquals(expected, form.testEmailAddress(input));
	}

	@Parameterized.Parameters
	public static Object squareData() {
		return Arrays.asList(new Object[][] { { true, "abc@yahoo.com" }, { true, "abc-100@yahoo.com" },
				{ true, "abc.100@yahoo.com" }, { true, "abc111@abc.com" }, { true, "abc-100@abc.net" },
				{ true, "abc.100@abc.com.au" }, { true, "abc@1.com" }, { true, "abc@gmail.co" },
				{ true, "abc+100@gmail.com" }, });
	}
}

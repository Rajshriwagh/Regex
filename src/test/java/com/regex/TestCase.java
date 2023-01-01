package com.regex;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class TestCase {
	 UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
	    @Test
	    public void NameTest(){
	        Assert.assertEquals(true, userRegistrationForm.checkFirstName("Rajshri") );
	    }
	    @Test
	    public void LastNameTest(){
	        Assert.assertEquals(true, userRegistrationForm.checkLastName("Wagh") );
	    }
	    @Test
	    public void EmailTest(){
	        Assert.assertEquals(true, userRegistrationForm.checkEmailAddress("mahajan.raj@bl.co.in") );
	    }
	    @Test
	    public void PhoneTest(){
	        Assert.assertEquals(true, userRegistrationForm.checkMobileNumber("+91 9582461123") );
	    }
	    @Test
	    public void PasswordTest(){
	        Assert.assertEquals(true, userRegistrationForm.checkPassword("12@ghfT34") );
	    }

	    
	}
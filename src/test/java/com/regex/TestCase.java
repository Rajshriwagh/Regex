package com.regex;
import junit.framework.Assert;
import org.junit.Test;

public class TestCase extends UserRegistrationForm {
	 @Test
	    public void NameTest(){
	        Assert.assertEquals(true, Name("Rajshri") );
	    }

	    @Test
	    public void LastNameTest(){
	        Assert.assertEquals(true, Last("Wagh") );
	    }
	    @Test
	    public void EmailTest(){
	        Assert.assertEquals(true, Email("mahajanrajshri@gmail.com") );
	    }
	    @Test
	    public void PhoneTest(){
	        Assert.assertEquals(true, Phone("91 9850460076") );
	    }
	    @Test
	    public void PasswordTest(){
	        Assert.assertEquals(true, Password("69@Tin123") );
	    }
	    
	}
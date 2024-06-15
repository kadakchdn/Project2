package TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectClasses.HomePage;
import PageObjectClasses.RegisterPage;

public class TestCase1_Register_ByTakingRegisterData_From_Config extends BaseTestCase
{
	
	
	@Test
	void Register1()
	{
		
		HomePage hp=new HomePage(driver);
	    hp.clickOnRegisterButton();
	    System.out.println("registration cicked");
	    RegisterPage rp=new RegisterPage(driver);
	    rp.clickRadioButton();
	    rp.enterFirstname(prop.getProperty("first_name"));
	    rp.enterLastName(prop.getProperty("last_name"));
	    rp.chooseDate("6");
	    rp.chooseMonth("June");
	    rp.chooseYear("2024");
	    rp.enterEmail(prop.getProperty("email"));
	    rp.enterCompanyName(prop.getProperty("companyname"));
	    rp.enterPassword(prop.getProperty("password"));
	    rp.enterConfirmPassword(prop.getProperty("confim_passwprd"));
	    rp.clickRegisterButton();
	    String msg=rp.getConfirmationMessage();
	    Assert.assertEquals(msg, "Your registration completed");
	    Assert.assertTrue(false);
    
	}
	
	
	
	
	
	
	
	
}

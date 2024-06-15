package TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectClasses.HomePage;
import PageObjectClasses.RegisterPage;
import Utilities.NormalUtilities;

public class TestCase1_Register_ByTakingRegisterData_From_RamdomMethods_FromUtility extends BaseTestCase
{
	
	
	@Test
	void Register2()
	{
		
		HomePage hp=new HomePage(driver);
	    hp.clickOnRegisterButton();
	    System.out.println("registration cicked");
	    RegisterPage rp=new RegisterPage(driver);
	    rp.clickRadioButton();
	    rp.enterFirstname(NormalUtilities.dynaicFirstname());
	    rp.enterLastName(NormalUtilities.dynaicLastName());
	    rp.chooseDate("6");
	    rp.chooseMonth("June");
	    rp.chooseYear("2024");
	    rp.enterEmail(NormalUtilities.dynaicEmail());
	    rp.enterCompanyName(NormalUtilities.companyName());
	    String pass= NormalUtilities.dynaicpassword();
	    rp.enterPassword(pass);
	    rp.enterConfirmPassword(pass);
	    rp.clickRegisterButton();
	    String msg=rp.getConfirmationMessage();
	    Assert.assertEquals(msg, "Your registration completed");
    
	}
	
	
	
	
	
	
	
	
}

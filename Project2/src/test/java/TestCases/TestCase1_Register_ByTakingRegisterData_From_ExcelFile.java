package TestCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectClasses.HomePage;
import PageObjectClasses.RegisterPage;
import Utilities.ReadingDataFromExcel;

public class TestCase1_Register_ByTakingRegisterData_From_ExcelFile extends BaseTestCase
{
	
	
	@Test(dataProvider="supplyRegisterData")
	void Register2(String fname, String lname, String Email, String Company_name, String Pword )
	{
		System.out.println("started");
		HomePage hp=new HomePage(driver);
	    hp.clickOnRegisterButton();
	    System.out.println("registration cicked");
	    RegisterPage rp=new RegisterPage(driver);
	    rp.clickRadioButton();
	    rp.enterFirstname(fname);
	    rp.enterLastName(lname);
	    rp.chooseDate("6");
	    rp.chooseMonth("June");
	    rp.chooseYear("2024");
	    rp.enterEmail(Email);
	    rp.enterCompanyName(Company_name);
	    //String pass= NormalUtilities.dynaicpassword();
	    rp.enterPassword(Pword);
	    rp.enterConfirmPassword(Pword);
	    rp.clickRegisterButton();
	    String msg=rp.getConfirmationMessage();
	    Assert.assertEquals(msg, "Your registration completed");
    
	}
	
	
	   @DataProvider
	   Object[][] supplyRegisterData() throws IOException
	   {
		  Object[][] register_data = ReadingDataFromExcel.getData();
		  
		return register_data;
		   
       }


	
	
	
	
	
}

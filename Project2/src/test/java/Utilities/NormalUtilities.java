package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class NormalUtilities 
{

	public static String dynaicFirstname()
	{
		Random ram=new Random();
		String dynamic_firstname="aks"+ram.nextInt(1000);
		return dynamic_firstname;
	
	}
	
	
	public static String dynaicLastName()
	{
		Random ram=new Random();
		String dynamic_lastname="kam"+ram.nextInt(1000);
		return dynamic_lastname;
	
	} 
	 
	public static String dynaicpassword()
	{
		Date date=new Date();
		String dynamic_pass="aks_"+date.getTime();
		return dynamic_pass;
	}
   
	

	public static String dynaicEmail()
	{
		Date date=new Date();
		String dynamic_email="aks"+date.getTime()+"@gmail.com";
		return dynamic_email;
	}

	public static String companyName()
	{
		Date date=new Date();
		String dynamic_email="tcs"+date.getTime()+"@gmail.com";
		return dynamic_email;
	}
	
	
	public static void onlyTakingScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2=new File("./Screenshots/akshay.png");
		FileUtils.copyFile(f1, f2);
	}
	
	public static String takingScreenshot_AddingToReports(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2=new File("./Screenshots/akshay.png");
		FileUtils.copyFile(f1, f2);
		return f2.getAbsolutePath();
	}
}

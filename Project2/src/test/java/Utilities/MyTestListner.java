package Utilities;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import ExtentReport.MyReport;



public class MyTestListner implements ITestListener
{

	ExtentReports report = MyReport.getExtentReport();
	ExtentTest test;
	

	@Override
	public void onTestStart(ITestResult result) {
		String testname = result.getName();
         test = report.createTest(testname);
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		String testname = result.getName();
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		WebDriver driver = null;
		String testname = result.getName();
		try {
			 driver = (WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			NormalUtilities.onlyTakingScreenshot(driver);
			String temp=NormalUtilities.takingScreenshot_AddingToReports(driver);
			test.addScreenCaptureFromPath(temp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	
	
	
}

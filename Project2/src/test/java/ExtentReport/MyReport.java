package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyReport 
{   
	
	public static ExtentReports getExtentReport()
	{
		 ExtentReports extent = new ExtentReports();
		
		 ExtentSparkReporter spark = new ExtentSparkReporter("./ExtentReportFolder/ExtentSpark.html");
		 
		 extent.attachReporter(spark);
		 
		
		 return extent;
		
		 
	}
	
}

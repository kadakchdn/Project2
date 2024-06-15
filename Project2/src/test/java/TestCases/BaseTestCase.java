package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTestCase
{
	
	public WebDriver driver;
	Properties prop;
	  Logger logger;
  
	  
    @Parameters({"browser","os"})
	@BeforeMethod
	void start(String browsername, String os) throws IOException
	{
    	
    	//loading the properties file.
      	FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
       prop=new Properties();
      	 prop.load(fis);
    	
        //logger 
    	logger = LogManager.getLogger(this.getClass());
    	
    	//choosing the browser.
    	switch(browsername.toLowerCase())
	       {
	         case "chrome": driver=new ChromeDriver(); break;
	          case "firefox": driver=new FirefoxDriver(); break;
	          default : System.out.println("no matching browser");
	          return; 
	        }
	
		driver.get("https://demo.nopcommerce.com/");
		logger.info("Navigated to URL");
		driver.manage().window().maximize();
		logger.info("Browers Maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	
	
	//@AfterMethod
	void tearDown()
	{
		driver.close();
		
	}

	
}

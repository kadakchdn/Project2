package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage
{
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement Radiobutton_male;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement Lastname;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement DayDropdown;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement MonthDropdown;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement YearDropdown;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement EmailField;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement CompanyName;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement Confirm_password;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement Registerbutton;
	
	@FindBy(xpath="//div[text()='Your registration completed']")
	WebElement Message;
	
	public String getConfirmationMessage()
	{
		return Message.getText();
	}
	public void clickRadioButton()
	{
		Radiobutton_male.click();
	}
	
	public void enterFirstname(String firstname)
	{
		Firstname.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname)
	{
		Lastname.sendKeys(lastname);
	}
	
	public void chooseDate(String date)
	{
		Select s=new Select(DayDropdown);
		s.selectByVisibleText(date);
	}
	
	public void chooseMonth(String month)
	{
		Select s=new Select(MonthDropdown);
		s.selectByVisibleText(month);
	}
	
	public void chooseYear(String year)
	{
		Select s=new Select(YearDropdown);
		s.selectByVisibleText(year);
	}
	
	public void enterEmail(String email)
	{
		EmailField.sendKeys(email);
	}
	
	public void enterCompanyName(String companyname)
	{
		CompanyName.sendKeys(companyname);
	}
	
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmpassword)
	{
		Confirm_password.sendKeys(confirmpassword);
	}
	
	public void clickRegisterButton()
	{
		Registerbutton.click();
	}
}

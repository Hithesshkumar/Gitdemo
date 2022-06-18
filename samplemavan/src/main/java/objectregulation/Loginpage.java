package objectregulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	
	@FindBy(id="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="submitBtn")
	WebElement login;
	
	@FindBy(id="errorMsg")
	WebElement errormessage;
	
	@FindBy(linkText="Forgot Password")
	WebElement forgetpassword;
	
	
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement username()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement login()
	{
		return login;
	}
	
	public WebElement Errormessage()
	{
		return errormessage;
	}
	public WebElement ForgotPassword()
	{
		return forgetpassword;
	}
}

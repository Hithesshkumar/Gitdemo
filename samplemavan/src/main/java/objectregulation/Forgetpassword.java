package objectregulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Forgetpassword {
	
	@FindBy(name = "userName")
	WebElement email;

	@FindBy(id = "submitBtn")
	WebElement submit;
	
	@FindBy(id = "errorMsg")
	WebElement emailvalid;

	private WebDriver driver;

	
	public Forgetpassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	public WebElement Email()
	{
		return email;
	}
	public WebElement Submitbutton()
	{
		return submit;
	}
	public WebElement Emailvalid()
	{
		return emailvalid;
	}
	
	
	
}

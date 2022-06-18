package objectregulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	WebDriver driver;
	
	By Eticketlogin =By.linkText("eTicket Login");

	By atboprlogin =By.linkText("ATB/OPR Login");
	
	
	public homepage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement eticketlogin()
	{
		return driver.findElement(Eticketlogin);
	}
	public WebElement atboprlogin()
	{
		return driver.findElement(atboprlogin);
	}
	
}

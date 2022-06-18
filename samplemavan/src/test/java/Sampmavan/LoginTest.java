package Sampmavan;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

     
       
public class LoginTest {

	 CommonMethods cm = new CommonMethods();
	
	/*@Test(groups = {"smoke"})
	public void Weblogin()
	{
		System.out.println("WebloginTc");
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/");
		driver.findElement(By.linkText("eTicket Login")).click();
		driver.findElement(By.id("userName")).sendKeys("loginname");
		driver.findElement(By.id("password")).sendKeys("password11");
		driver.findElement(By.name("submitBtn")).click();

	}*/

	@Test(groups = {"Regression"})
	public void Forgetpassword()
	{
		System.out.println("ForgetpasswordTc");
		//Assert.assertTrue(false);
	}
	
	@Test
	
	public void  LoginNameValid() throws IOException
	{
		ArrayList<String>  tcdata =   cm.getdatafrmexl("LoginNameValid");
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SVEC\\Desktop\\AUTOMATIN TESTING\\SELINIUM TESTING\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.apsrtconline.in/");
		
	    driver.findElement(By.linkText("eTicket Login")).click();
	    
	    driver.findElement(By.className("subHeaderText")).getText();
	    
	  
	    driver.findElement(By.linkText("SignUp")).click();
	    
	    driver.findElement(By.cssSelector("input#loginName")).sendKeys(tcdata.get(1));
	    
	    driver.findElement(By.cssSelector("input[name='fullName']")).sendKeys(tcdata.get(2));
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(tcdata.get(4));
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(tcdata.get(3));
	     
	    driver.findElement(By.xpath("//input[@type='button']")).click();
	    
	 
		
		
	}

	}


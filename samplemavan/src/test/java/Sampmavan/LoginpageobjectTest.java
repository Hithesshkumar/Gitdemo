package Sampmavan;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import object.init;
import objectregulation.Forgetpassword;
import objectregulation.Loginpage;
import objectregulation.homepage;

public class LoginpageobjectTest  extends init {
	
	 public WebDriver driver;
	
	public  static Logger log = LogManager.getLogger(init.class.getName());
	   
	 @BeforeTest
	 public void installisation() throws IOException
	 {
		 driver = BrowserInstallization();
		 String url =  prop.getProperty("url");
		driver.get(url);
		log.info("Navigated to Apsrtc page sucessfully");
	 }
	
	 
	@Test
	
	public void SuccussfullLogin() throws IOException
	{
		
		homepage hp = new homepage(driver);
		hp.eticketlogin().click();
		log.debug("Click on eticketlogin link");
	
		Loginpage lg = new Loginpage(driver);
		
		lg.username().sendKeys("Hithessh kumar");
         log.debug("Entered username");
		lg.password().sendKeys("password11");
		  log.debug("Entered password");
		lg.login().click();
		log.debug("Click on login button");
		
	String Experrormsg = "Login incorrect. Please try ";
	String acterrormsg =lg.Errormessage().getText();
	
	Assert.assertEquals(acterrormsg,Experrormsg );
  log.info("Validation was sucessfully");

	}
	 @Test
	 public void forgetpassword() throws IOException
	 {
	
			
		 homepage hp = new homepage(driver);
			hp.eticketlogin().click();
			log.debug("Clicked on eticket login");
			
			Loginpage lg = new Loginpage(driver);
			lg.ForgotPassword().click();
			log.debug("Clicked on Forget password");
			
			Forgetpassword fp = new Forgetpassword(driver);
			fp.Email().sendKeys("hitheshkumar@gmail.com");
			log.debug("Entered emailid");
			fp.Submitbutton().click();
			log.debug("clicked login button");
			
	    String Experrormsg ="Login Name not found in the system.";
		String Acterrormsg = fp.Emailvalid().getText();
		
		Assert.assertEquals(Acterrormsg,Experrormsg );
		log.info("Validation was sucessfully");
	 }
	
	@AfterTest
	
	public void installisationback()
	{
		driver.close();
	}
	
}

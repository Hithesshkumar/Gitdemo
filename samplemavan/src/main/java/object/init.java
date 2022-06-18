package object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class init {
	
      public WebDriver driver;
      
      public Properties prop;
	
	public WebDriver BrowserInstallization() throws IOException
	{
		 prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\SVEC\\Desktop\\AUTOMATIN TESTING\\SELINIUM TESTING\\samplemavan\\sources\\config.Properties");
		
		prop.load(fis);
		
		String Browsername = prop.getProperty("Browser");
		
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();	
		}
		else if(Browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new ChromeDriver();	
			
		}else if(Browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new ChromeDriver();	
		}
			
		return driver;
	}
	
	
	public String Getscreenshot(String Tcname, WebDriver driver) throws IOException 
	{
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		
	 File src = tss.getScreenshotAs(OutputType.FILE);
	 
	String Destinationfile =  System.getProperty("user.dir")+"\\Reports\\"+Tcname+".png";
	
	FileUtils.copyFile(src, new File(Destinationfile));
	
	return Destinationfile;
	}


	
	
	
	
	
	
	

}

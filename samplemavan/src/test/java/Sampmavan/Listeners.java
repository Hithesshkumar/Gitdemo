package Sampmavan;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import object.init;

public class Listeners extends init implements ITestListener {

	ExtentReports extent = ReporterCls.Generatereports();
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
		
	 test = extent.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
	test.pass("Testcase executed sucessfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		
		WebDriver driver = null;
		String Tcname = result.getName();
		String Screenshotpath = null;
		test.fail(result.getThrowable());
		
		
	  try {
		driver =  (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	}
	  catch (Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	  try {
		  
		   Screenshotpath =  Getscreenshot(Tcname,driver);
	      }
	  catch (IOException e)
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
		test.addScreenCaptureFromPath(Screenshotpath, Tcname);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
		extent.flush();
	}

	
	
}

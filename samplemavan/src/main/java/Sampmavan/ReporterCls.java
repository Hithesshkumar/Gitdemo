package Sampmavan;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReporterCls {

	ExtentReports extent;
	
	public static ExtentReports Generatereports()
	{
		
		String Reportfile = System.getProperty("user.dir")+"\\Reports\\report.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(Reportfile);
		
		reporter.config().setDocumentTitle("QA Test Result");
		
		reporter.config().setReportName("APSRTC AUTOMATION EXECUTION");
		
		ExtentReports extent = new ExtentReports();
		
		extent.setSystemInfo("TESTING TEAM", "QA AUTOMATION");
		
		extent.setSystemInfo("TESTER", "Hithessh kumar ");
				
		
		extent.attachReporter(reporter);
		
		return extent;
	
	}
	 
}

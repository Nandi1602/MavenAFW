package com.qspiders.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoC {
	
	ExtentReports report = new ExtentReports("./ExtentReport/ExtentReport.html",false);
	
	@Test
	public void extnreports()
	{
		
		ExtentTest logger = report.startTest("extnreports");
		logger.log(LogStatus.PASS, "test passed");
		report.endTest(logger);
		//report.flush();
		
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		driver.close();
		Reporter.log("Test Executed from Jenkins", true);*/
	}
	
	@Test
	public void test1()
	{
		
		ExtentTest logger = report.startTest("test1");
		logger.log(LogStatus.FAIL, "test failed");
		report.endTest(logger);
		report.flush();
		
		
	}

}

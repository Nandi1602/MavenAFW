package com.qspiders.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC {
	@Test
	public void test()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		driver.close();
		Reporter.log("Test Executed from Jenkins", true);
	}

}

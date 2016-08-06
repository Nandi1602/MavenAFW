package com.qspiders.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void test()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.close();
	}

}

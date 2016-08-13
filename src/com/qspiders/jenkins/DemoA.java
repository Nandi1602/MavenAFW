package com.qspiders.jenkins;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	
	@Test
	public void test()
	{
		
		Reporter.log("Failed Test");
		Assert.fail();
	}

}

package com.project.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.project.base.TestBase;

public class TestUtil extends TestBase{
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");		
		FileUtils.copyFile(scrFile, new File(currentDir +System.currentTimeMillis() + ".png")); // + means append with current timemillis
		
		
	}
					
	}



package com.herokuapp.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.herokuapp.Base.Base;



public class ScreenshotUtil extends Base{
	
	static WebDriver driver;
	
	public static String getBase64img(WebDriver driver) {
		ScreenshotUtil.driver = driver;
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}

}

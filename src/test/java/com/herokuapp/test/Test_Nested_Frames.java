package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Nested_Frames;
import com.herokuapp.utilities.CommonActions;

public class Test_Nested_Frames extends Base{
	
 @Test(description ="To Validate Nested_Frames separately  Element" )
	
	public void Nested_Frames() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Nested_Frames F=new Nested_Frames(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", F.Nested_frames);

		    C.click_on_Element(F.Nested_frames);
		    C.wait(2000);
		    driver.switchTo().frame(F.Nested_TOPframe).switchTo().frame(F.frame_LEFT);            
	        driver.switchTo().frame(F.Nested_TOPframe).switchTo().frame(F.frame_RIGHT);
	        driver.switchTo().frame(F.Nested_TOPframe).switchTo().frame(F.frame_middle);
	        driver.switchTo().frame(F.Nested_TOPframe).switchTo().frame(F.frame_BOTTOM);
		
		
}}

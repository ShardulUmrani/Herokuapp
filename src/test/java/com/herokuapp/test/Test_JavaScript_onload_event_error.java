package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.JavaScript_onload_event_error;
import com.herokuapp.utilities.CommonActions;

public class Test_JavaScript_onload_event_error extends Base{
	
 @Test(description ="To Validate JavaScript_onload_event_error Element" )
	
	public void JavaScript_onload_event_error() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		JavaScript_onload_event_error J=new JavaScript_onload_event_error(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", J.JavaScript_onload_event_error);

		C.wait(2000);
		C.click_on_Element(J.JavaScript_onload_event_error);
		
		
}}

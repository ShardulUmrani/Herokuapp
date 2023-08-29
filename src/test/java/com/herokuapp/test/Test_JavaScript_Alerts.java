package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.JavaScript_Alerts;
import com.herokuapp.utilities.CommonActions;

public class Test_JavaScript_Alerts extends Base{
	
 @Test(description ="To Validate JavaScript_Alerts Element" )
	
	public void JavaScript_Alerts() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		JavaScript_Alerts J=new JavaScript_Alerts(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", J.JavaScript_Alerts);
		C.click_on_Element(J.JavaScript_Alerts);
		
		C.click_on_Element(J.Alert_JS);
		driver.switchTo().alert().accept();
		
		C.click_on_Element(J.Alert_js_Confirm);
		driver.switchTo().alert().dismiss();
		
		C.click_on_Element(J.Alert_js_Prompt);
		driver.switchTo().alert().sendKeys("ABCD");
		driver.switchTo().alert().accept();

		
		
}}

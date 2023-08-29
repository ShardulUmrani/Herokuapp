package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Infinite_Scroll;
import com.herokuapp.utilities.CommonActions;

public class Test_Infinite_Scroll extends Base{
	
 @Test(description ="To Validate Infinite_Scroll Element" )
	
	public void Infinite_Scroll() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Infinite_Scroll I=new Infinite_Scroll(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;

		C.click_on_Element(I.Infinite_Scroll);
		C.wait(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		C.wait(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		C.wait(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		C.wait(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		C.wait(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		C.wait(1000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
 
 }}

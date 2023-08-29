package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Key_Presses;
import com.herokuapp.utilities.CommonActions;

public class Test_Key_Presses extends Base{
	
 @Test(description ="To Validate Key_Presses Element" )
	
	public void Key_Presses() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Key_Presses K=new Key_Presses(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", K.Key_Presses);

	C.wait(2000);
		C.click_on_Element(K.Key_Presses);
		K.Enter_Key_Pressesbox.sendKeys("a");
		K.Enter_Key_Pressesbox.clear();
		C.wait(2000);
		K.Enter_Key_Pressesbox.sendKeys("8");
		K.Enter_Key_Pressesbox.clear();
		C.wait(2000);
		K.Enter_Key_Pressesbox.sendKeys("F");
		K.Enter_Key_Pressesbox.clear();
		C.wait(2000);
		K.Enter_Key_Pressesbox.sendKeys("3");
		K.Enter_Key_Pressesbox.clear();
		C.wait(2000);
		K.Enter_Key_Pressesbox.sendKeys("Z");
		K.Enter_Key_Pressesbox.clear();
		C.wait(2000);
		K.Enter_Key_Pressesbox.sendKeys("D");
		K.Enter_Key_Pressesbox.clear();
		
		
		
}}

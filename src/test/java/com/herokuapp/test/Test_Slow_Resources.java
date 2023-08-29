package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Slow_Resources;
import com.herokuapp.utilities.CommonActions;

public class Test_Slow_Resources extends Base{
	
 @Test(description ="To Validate Slow_Resources Element" )
	
	public void Slow_Resources() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Slow_Resources SR=new Slow_Resources(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",SR.Slow_Resources );

		   C.click_on_Element(SR.Slow_Resources);
		   System.out.println(SR.Slow_Resources_text.getText());
           
}}

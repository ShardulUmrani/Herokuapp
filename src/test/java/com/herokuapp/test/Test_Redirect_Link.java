package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Redirect_Link;
import com.herokuapp.utilities.CommonActions;

public class Test_Redirect_Link extends Base{
	
 @Test(description ="To Validate Redirect_Link Element" )
	
	public void Redirect_Link() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Redirect_Link R=new Redirect_Link(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", R.Redirect_Link);

		   C.click_on_Element(R.Redirect_Link);
		   C.click_on_Element(R.Click_here_to_Redirection);
		   
		   C.click_on_Element(R.Status_Codes_200);
		   System.out.println(R.Status200.getText()+" = Status_Codes_200");
           C.click_on_Element(R.GOTO_status_codes);
           C.click_on_Element(R.Status_Codes_301);
		   System.out.println(R.Status301.getText()+" = Status_Codes_301");
           C.click_on_Element(R.GOTO_status_codes);
           C.click_on_Element(R.Status_Codes_404);
		   System.out.println(R.Status404.getText()+" = Status_Codes_404");
           C.click_on_Element(R.GOTO_status_codes);
           C.click_on_Element(R.Status_Codes_500);
		   System.out.println(R.Status500.getText()+" = Status_Codes_500");
           C.click_on_Element(R.GOTO_status_codes);
           
}}

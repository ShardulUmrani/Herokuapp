package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Status_Codes;
import com.herokuapp.utilities.CommonActions;

public class Test_Status_Codes extends Base{
	
 @Test(description ="To Validate Status_Codes Element" )
	
	public void Status_Codes() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Status_Codes R=new Status_Codes(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",R.Status_Codes );

        C.click_on_Element(R.Status_Codes);
        
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

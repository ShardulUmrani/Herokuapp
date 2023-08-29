package com.herokuapp.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.EnteryExit;
import com.herokuapp.utilities.CommonActions;
import org.testng.asserts.SoftAssert;

public class Test_EnteryExit extends Base{
	
	
	

	//_____________Entery ADD
 @Test(description ="To Validate EnteryExit Element" )
	
	public void Entery() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		EnteryExit E=new EnteryExit(driver);
		
		

		C.click_on_Element(E.Entery_Add);
		C.click_on_Element(E.Button_Close);
		C.wait(3000);
		A.doubleClick(E.Link_To_re_enable).perform();
		C.wait(3000);
		C.click_on_Element(E.Button_Close);

		
		
 }
 
//_____________Exit Intent
 
	@Test(description ="To Validate Exit Element" )
		
		public void Exit() {
		
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		EnteryExit E=new EnteryExit(driver);
		SoftAssert softAssert = new SoftAssert();

		
		C.click_on_Element(E.Exit_intent);
		if(E.close.isDisplayed()) {
			
			C.wait(3000);
			C.click_on_Element(E.Button_Close);
		}
		else {
			System.out.println("Exit Intent is not displayed");
			
		}
		
}}
package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Inputs;
import com.herokuapp.utilities.CommonActions;

public class Test_Inputs extends Base{
	
 @Test(description ="To Validate Inputs Element" )
	
	public void Inputs() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Inputs I=new Inputs(driver);

		C.click_on_Element(I.Inputs);
		I.Input_Number_field.sendKeys("4");
		C.performRefresh();
		I.Input_Number_field.sendKeys("-100");
		C.performRefresh();
		I.Input_Number_field.sendKeys("-10000000");
		C.wait(2000);
		C.performRefresh();
		I.Input_Number_field.sendKeys("66");
		C.performRefresh();
		
}}

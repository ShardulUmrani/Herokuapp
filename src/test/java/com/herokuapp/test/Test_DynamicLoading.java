package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.DynamicLoading;
import com.herokuapp.utilities.CommonActions;

public class Test_DynamicLoading extends Base{
	
 @Test(description ="To Validate DynamicLoading Element" )
	
	public void DynamicLoading() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		DynamicLoading D=new DynamicLoading(driver);

		C.click_on_Element(D.Dynamic_Loading);
		C.click_on_Element(D.Dynamic_Loading_Example_1);
		C.click_on_Element(D.Button_Start);
		C.wait(2000);
		
		driver.navigate().back();
		C.wait(3000);
		C.click_on_Element(D.Dynamic_Loading_Example_2);
		C.click_on_Element(D.Button_Start);
		driver.navigate().back();
		
}}

package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.DynamicControls;
import com.herokuapp.utilities.CommonActions;

public class Test_DynamicControls extends Base{
	
 @Test(description ="To Validate DynamicControls Element" )
	
	public void DynamicControls() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		DynamicControls D=new DynamicControls(driver);
	
		
		C.click_on_Element(D.dynamic_controls);
		C.click_on_Element(D.A_checkbox);
		C.click_on_Element(D.Button_Remove);
		C.wait(3000);
		C.click_on_Element(D.Button_ADD);
		
		C.click_on_Element(D.Button_Enable);
		C.wait(3000);
		C.click_on_Element(D.Button_Disable);

}}

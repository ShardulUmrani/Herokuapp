package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Dropdown;
import com.herokuapp.utilities.CommonActions;

public class Test_Dropdown extends Base{
	
@Test(groups="sanity " ,description ="To Validate Dropdown Element" )
	
	public void DragandDrop() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Dropdown D=new Dropdown(driver);
		
		
		C.click_on_Element(D.Dropdown);
		C.click_on_Element(D.Select_from_Dropdown);
		C.click_on_Element(D.Select_option2);
		C.wait(2000);
		C.click_on_Element(D.Select_from_Dropdown);
		C.click_on_Element(D.Select_option1);
		
}}

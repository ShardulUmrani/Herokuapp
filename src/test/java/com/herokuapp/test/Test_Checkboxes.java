package com.herokuapp.test;

import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.utilities.CommonActions;
import com.herokuapp.pages.Checkboxes;
public class Test_Checkboxes extends Base {
	
	

@Test(description="To Validate Checkboxes Elements")
	
	public void Checkboxes(){

	CommonActions C = new CommonActions();
	Checkboxes Ch=new Checkboxes(driver);
	
	C.click_on_Element(Ch.checkboxes);
    C.click_on_Element(Ch.checkbox_1);
    C.wait(2000);
    C.click_on_Element(Ch.checkbox_2);
    C.wait(2000);
    C.click_on_Element(Ch.checkbox_1);
}}

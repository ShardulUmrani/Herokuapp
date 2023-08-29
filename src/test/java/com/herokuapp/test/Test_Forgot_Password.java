package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Forgot_Password;
import com.herokuapp.utilities.CommonActions;

public class Test_Forgot_Password extends Base{
	
 @Test(description ="To Validate Forgot_Password Element" )
	
	public void Forgot_Password() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Forgot_Password F=new Forgot_Password(driver);
		
		
		C.click_on_Element(F.forgot_password);
		F.Input_Email.sendKeys("ABCDEFG@Gmail.com");
		C.click_on_Element(F.Reset_Password);
		

}}

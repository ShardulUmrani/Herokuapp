package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Form_Authentication;
import com.herokuapp.utilities.CommonActions;

public class Test_Form_Authentication extends Base{
	
 @Test(description ="To Validate Form_Authentication Element" )
	
	public void Form_Authentication() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Form_Authentication F=new Form_Authentication(driver);
		
		C.click_on_Element(F.Form_Authentication);
		F.Input_Username.sendKeys("tomsmith");//ID =  tomsmith
		F.Input_password.sendKeys("SuperSecretPassword!");//Pass = SuperSecretPassword!
		C.wait(2000);
		C.click_on_Element(F.Button_Login);
		C.wait(2000);
		C.click_on_Element(F.Button_Logout);

		
}}

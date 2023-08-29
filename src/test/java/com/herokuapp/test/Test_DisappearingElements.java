package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.DisappearingElements;
import com.herokuapp.utilities.CommonActions;

public class Test_DisappearingElements extends Base {
	
	@Test(description ="To Validate Disappearing Element" )
	
	public void DisappearingElements() {
		
		CommonActions C = new CommonActions();
		DisappearingElements D=new DisappearingElements (driver);
		Actions A=new Actions(driver);
		
		C.click_on_Element(D.Disappearing_elements);
		C.click_on_Element(D.button_about);
		C.wait(2000);
        driver.navigate().back();
        
        C.click_on_Element(D.button_contact_us);
        C.wait(2000);
        driver.navigate().back();
        
        C.click_on_Element(D.button_portfolio);
        C.wait(2000);
        driver.navigate().back();
        
        C.click_on_Element(D.button_gallery);
        C.wait(2000);
        driver.navigate().back();
        
        C.click_on_Element(D.button_Home);
        
}}

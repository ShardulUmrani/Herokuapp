package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Horizontal_Slider;
import com.herokuapp.utilities.CommonActions;

public class Test_Horizontal_Slider extends Base{
	
 @Test(description ="To Validate Horizontal_Slider Element" )
	
	public void Horizontal_Slider() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Horizontal_Slider H=new Horizontal_Slider(driver);

		C.click_on_Element(H.Horizontal_Slider);
		A.dragAndDrop(H.Slider_Bar, H.Slider_Bar_2).build().perform();
		C.wait(2000);
		C.performRefresh();
		A.clickAndHold(H.Slider_Bar).perform();
		
}}

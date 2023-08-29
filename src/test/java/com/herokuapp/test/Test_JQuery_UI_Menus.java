package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.JQuery_UI_Menus;
import com.herokuapp.utilities.CommonActions;

public class Test_JQuery_UI_Menus extends Base{
	
 @Test(description ="To Validate JQuery_UI_Menus Element" )
	
	public void JQuery_UI_Menus() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		JQuery_UI_Menus J=new JQuery_UI_Menus(driver);

		C.click_on_Element(J.JQuery_UI_Menus);
		C.click_on_Element(J.button_Enabled);
		C.click_on_Element(J.Downloads);
		C.click_on_Element(J.Downloads_Excel);
		C.performRefresh();
		C.wait(3000);
		C.click_on_Element(J.button_Enabled);
		C.click_on_Element(J.Downloads_Back_to_Jquery_UI);
		C.click_on_Element(J.Jquery_UI_Menu);
		
		C.click_on_Element(J.button_Enabled);
		C.click_on_Element(J.Downloads);
		C.click_on_Element(J.Downloads_CSV);
		C.performRefresh();
		C.wait(3000);
		C.click_on_Element(J.button_Enabled);
		C.click_on_Element(J.Downloads_Back_to_Jquery_UI);
		C.click_on_Element(J.Jquery_UI_Menu);

		C.click_on_Element(J.button_Enabled);
		C.click_on_Element(J.Downloads);
		C.click_on_Element(J.Downloads_PDF);
		C.performRefresh();
		C.wait(3000);
		C.click_on_Element(J.button_Enabled);
		C.click_on_Element(J.Downloads_Back_to_Jquery_UI);
		C.click_on_Element(J.Jquery_UI_Menu);
		
		
		
}
}

package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Notification_Messages;
import com.herokuapp.utilities.CommonActions;

public class Test_Notification_Messages extends Base{
	
 @Test(description ="To Validate Notification_Messages Element" )
	
	public void Notification_Messages() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Notification_Messages N=new Notification_Messages(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", N.Notification_message);

		   C.click_on_Element(N.Notification_message);
		   C.click_on_Element(N.loadnewmessage_click_here);
		   System.out.println(N.Check_action_status.getText()+" = 1st Click");
		   

		   C.click_on_Element(N.loadnewmessage_click_here);
		   System.out.println(N.Check_action_status.getText()+" = 2nd Click");
		   
		   C.click_on_Element(N.loadnewmessage_click_here);
		   System.out.println(N.Check_action_status.getText()+"  = 3rd Click");
		   
		   
		   C.click_on_Element(N.loadnewmessage_click_here);
		   System.out.println(N.Check_action_status.getText()+" = 4th Click");
		   
		   C.click_on_Element(N.loadnewmessage_click_here);
		   System.out.println(N.Check_action_status.getText()+" = 5th Click");
		   
		   C.click_on_Element(N.loadnewmessage_click_here);
		   System.out.println(N.Check_action_status.getText()+" = 5th Click");
		   
		   
}}

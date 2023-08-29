package com.herokuapp.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Multiple_Windows;
import com.herokuapp.utilities.CommonActions;

public class Test_Multiple_Windows extends Base{
	
 @Test(description ="To Validate Multiple_Windows Element" )
	
	public void Multiple_Windows() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Multiple_Windows M=new Multiple_Windows(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", M.Multiple_Windows);

C.click_on_Element(M.Multiple_Windows);
C.click_on_Element(M._Button_Click_here);

 Set<String> handle = driver.getWindowHandles();
 System.out.println(handle);	
 Iterator <String> it = handle.iterator();
		
 String pareentID = it.next();
 System.out.println("Parent ID : " + pareentID);

 String childID=	it.next();
 System.out.println("Child ID : " + childID);

 driver.switchTo().window(childID);
 driver.switchTo().window(pareentID);

 driver.quit();

}}

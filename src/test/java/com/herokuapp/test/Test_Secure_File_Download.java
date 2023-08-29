package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Secure_File_Download;
import com.herokuapp.utilities.CommonActions;

public class Test_Secure_File_Download extends Base{
	
 @Test(description ="To Validate Secure_File_Download Element" )
	
	public void Secure_File_Download() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Secure_File_Download S=new Secure_File_Download(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", S.Secure_File_Download);

		   C.click_on_Element(S.Secure_File_Download);
		   driver.get("https://admin:admin@the-internet.herokuapp.com/download_secure");
           C.click_on_Element(S.File_Download_test1_txt);
		   
		   
		 
}}

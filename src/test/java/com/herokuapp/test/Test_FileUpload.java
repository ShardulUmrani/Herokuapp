package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.FileUpload;
import com.herokuapp.utilities.CommonActions;

public class Test_FileUpload extends Base{
	
 @Test(description ="To Validate FileUpload Element" )
	
	public void FileUpload() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		FileUpload F=new FileUpload(driver);
		
		C.click_on_Element(F.File_upload);
		F.Chose_File.sendKeys("C:\\Users\\SHARDUL\\eclipse-workspace\\herokuapp\\test-data\\test.jpg");
       C.wait(2000);
		C.click_on_Element(F.Button_Upload);
		
}}

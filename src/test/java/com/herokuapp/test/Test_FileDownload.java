package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.FileDownload;
import com.herokuapp.utilities.CommonActions;

public class Test_FileDownload extends Base{
	
 @Test(description ="To Validate FileDownload Element" )
	
	public void FileDownload() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		FileDownload F=new FileDownload(driver);

		C.click_on_Element(F.File_Download);
		C.wait(3000);
		C.click_on_Element(F.File_Download_Class_data);
		//C.wait(3000);
		//C.click_on_Element(F.File_Download_empty_txt);
		//C.wait(3000);
		//C.click_on_Element(F.File_Download_image);
		//C.wait(3000);
		
}}

package com.herokuapp.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class FileUpload extends Base{
	WebDriver driver ;
	
	
	public FileUpload(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/upload']")
	public WebElement File_upload ;
	
	@FindBy(xpath="//input[@id='file-upload']")
	public WebElement Chose_File ;
	
	
	
	@FindBy(xpath="//input[@id='file-submit']")
	public WebElement Button_Upload ;
	
	
	
	

}

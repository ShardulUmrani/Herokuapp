package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Secure_File_Download extends Base{
	
	
	WebDriver driver ;
	
	public Secure_File_Download(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/download_secure']")
	public WebElement  Secure_File_Download;
	

	@FindBy(xpath="//a[@href='download_secure/demo.txt']")
	public WebElement  File_Download_test1_txt;

}

package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class FileDownload extends Base{
	WebDriver driver ;
	
	
	public FileDownload(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/download']")
	public WebElement File_Download ;
	
	@FindBy(xpath="//a[@href='download/test.jpg']")
	public WebElement  File_Download_Class_data;
	
	@FindBy(xpath="//a[@href='download/Sample-jpg-image-200kb.jpg']")
	public WebElement  File_Download_image;
	
	@FindBy(xpath="//a[@href='download/not_empty.txt']")
	public WebElement  File_Download_empty_txt;
	

}

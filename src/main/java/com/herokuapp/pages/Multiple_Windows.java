package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Multiple_Windows extends Base{

	WebDriver driver ;
	
	public Multiple_Windows(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/windows']")
	public WebElement  Multiple_Windows;

	@FindBy(xpath="//a[@href='/windows/new']")
	public WebElement  _Button_Click_here;
	
	
}

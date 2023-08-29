package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Key_Presses extends Base{

	WebDriver driver ;
	
	public Key_Presses(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/key_presses']")
	public WebElement  Key_Presses;

	@FindBy(xpath="//input[@id='target']")
	public WebElement  Enter_Key_Pressesbox;
	
	
}

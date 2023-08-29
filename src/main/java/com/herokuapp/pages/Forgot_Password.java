package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Forgot_Password extends Base{
	
	
	WebDriver driver ;
	
	public Forgot_Password(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/forgot_password']")
	public WebElement forgot_password ;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement Input_Email ;
	
	@FindBy(xpath="//button[@id='form_submit']")
	public WebElement Reset_Password ;
	
	

}

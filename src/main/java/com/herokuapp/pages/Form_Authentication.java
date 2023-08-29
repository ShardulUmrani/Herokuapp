package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Form_Authentication extends Base{
	
	
	WebDriver driver ;
	
	public Form_Authentication(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/login']")
	public WebElement Form_Authentication ;

	@FindBy(xpath="//input[@id='username']")
	public WebElement Input_Username ;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement Input_password ;
	
	@FindBy(xpath="//i[@class='fa fa-2x fa-sign-in']")
	public WebElement Button_Login ;
	
	@FindBy(xpath="//i[@class='icon-2x icon-signout']")
	public WebElement Button_Logout ;
	
	
	//ID =  tomsmith
	//Pass = SuperSecretPassword!
}

package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class BasicAuthlogin extends Base {
	WebDriver driver;
	
	public BasicAuthlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//a[@href='/basic_auth']")
	public WebElement basic_auth_login;
// (user and pass: admin)
	
	
	
	
}

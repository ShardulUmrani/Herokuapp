package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Slow_Resources extends Base{
	
	
	WebDriver driver ;
	
	public Slow_Resources(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/slow']")
	public WebElement Slow_Resources ;
	
	@FindBy(xpath="//p[contains(text(),'At times it can take a while for third-party site ')]")
	public WebElement Slow_Resources_text ;
}



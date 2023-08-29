package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class JavaScript_onload_event_error extends Base{

	WebDriver driver ;
	
	public JavaScript_onload_event_error(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/javascript_error']")
	public WebElement  JavaScript_onload_event_error;

}

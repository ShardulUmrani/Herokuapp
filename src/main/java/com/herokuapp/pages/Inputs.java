package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Inputs extends Base{
	
	
	WebDriver driver ;
	

	
	public Inputs(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/inputs']")
	public WebElement  Inputs;
	
	@FindBy(xpath="//input[@type='number']")
	public WebElement  Input_Number_field;
	
}

package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Dropdown extends Base{
	WebDriver driver ; 
	
	public Dropdown(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/dropdown']")
	public WebElement Dropdown; 
	

	@FindBy(xpath="//select[@id='dropdown']")
	public WebElement Select_from_Dropdown ; 
	
	
	@FindBy(xpath="//option[@value='1']")
	public WebElement Select_option1 ;
	

	@FindBy(xpath="//option[@value='2']")
	public WebElement Select_option2;
	
}

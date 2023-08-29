package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class DynamicLoading extends Base{
	WebDriver driver ;
	
	
	public DynamicLoading(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/dynamic_loading']")
	public WebElement Dynamic_Loading ;
	
	@FindBy(xpath="//a[@href='/dynamic_loading/1']")
	public WebElement Dynamic_Loading_Example_1;
	
	@FindBy(xpath="//button[normalize-space()='Start']")
	public WebElement Button_Start;
	
	@FindBy(xpath="//a[@href='/dynamic_loading/2']")
	public WebElement Dynamic_Loading_Example_2;
}

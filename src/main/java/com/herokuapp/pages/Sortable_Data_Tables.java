package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Sortable_Data_Tables extends Base{
	
	
	WebDriver driver ;
	
	public Sortable_Data_Tables(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	
	@FindBy(xpath="//a[@href='/tables']")
	public WebElement Sortable_Data_Tables ;
	
	@FindBy(xpath="//div[@class='example']")
	public WebElement Data_Tables ;

	@FindBy(xpath="//span[@class='last-name']")
	public WebElement Sortable_Data_Tables2 ;
	
}

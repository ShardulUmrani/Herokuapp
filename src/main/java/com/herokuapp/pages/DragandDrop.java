package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class DragandDrop extends Base{
	WebDriver driver ; 
	
	public DragandDrop(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/drag_and_drop']")
	public WebElement drag_and_drop; 
	
	@FindBy(xpath="//div[@id='column-a']")
	public WebElement Column_A; 

	@FindBy(xpath="//div[@id='column-b']")
	public WebElement Column_B; 
	
	

}

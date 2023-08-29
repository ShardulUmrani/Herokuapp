package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class DynamicControls extends Base{
WebDriver driver ;
	
		
		public DynamicControls(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}

		
	@FindBy(xpath="//a[@href='/dynamic_controls']")
	public WebElement dynamic_controls; 
	
	   
	 @FindBy(xpath="//input[@type='checkbox']")
	public WebElement A_checkbox;
		 
	@FindBy(xpath="//button[@onclick='swapCheckbox()']")
	public WebElement Button_Remove; 
		 
	@FindBy(xpath="//button[@onclick='swapCheckbox()']")
	public WebElement Button_ADD;
	
	@FindBy(xpath="//button[@onclick='swapInput()']")
	public WebElement Button_Enable;
	
	@FindBy(xpath="//input[@style='width: 30%;']")
	public WebElement TextBox;

	
	@FindBy(xpath="//button[@onclick='swapInput()'] ")
	public WebElement Button_Disable;
	
}

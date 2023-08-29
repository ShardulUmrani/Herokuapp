package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Checkboxes extends Base {
	WebDriver driver ; 
	
	public Checkboxes(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[@href='/checkboxes']")
	public WebElement checkboxes;
	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement checkbox_1 ;
	
	@FindBy(xpath="//input[@type='checkbox'][2]")
	public WebElement checkbox_2;
	

	

}

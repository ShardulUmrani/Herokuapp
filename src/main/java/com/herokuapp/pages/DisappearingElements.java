package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class DisappearingElements extends Base{
	WebDriver driver ; 
	
	public DisappearingElements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[@href='/disappearing_elements']")
	public WebElement Disappearing_elements;
	
	@FindBy(xpath="//a[@href='/about/']")
	public WebElement button_about;
	 
	@FindBy(xpath="//a[@href='/contact-us/']")
	public WebElement button_contact_us;
	
	@FindBy(xpath="//a[@href='/portfolio/']")
	public WebElement button_portfolio;
	
	@FindBy(xpath="//a[@href='/gallery/']")
	public WebElement button_gallery;
	
	@FindBy(xpath="//a[@href='/']")
	public WebElement button_Home;
	
}

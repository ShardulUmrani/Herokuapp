package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Notification_Messages extends Base{
	
	
	WebDriver driver ;
	
	public Notification_Messages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/notification_message']")
	public WebElement Notification_message ;
	
	@FindBy(xpath="//a[@href='/notification_message']")
	public WebElement loadnewmessage_click_here ;
	
	@FindBy(xpath="//div[@id='flash']")
	public WebElement Check_action_status ;
	
	

}

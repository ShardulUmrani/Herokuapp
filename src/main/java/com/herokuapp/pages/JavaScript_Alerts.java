package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class JavaScript_Alerts extends Base{

	WebDriver driver ;
	
	public JavaScript_Alerts(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/javascript_alerts']")
	public WebElement  JavaScript_Alerts;
	
	@FindBy(xpath="//button[@onclick='jsAlert()']")
	public WebElement  Alert_JS;
	
	@FindBy(xpath="//button[@onclick='jsConfirm()']")
	public WebElement  Alert_js_Confirm;
	
	@FindBy(xpath="//button[@onclick='jsPrompt()']")
	public WebElement  Alert_js_Prompt;
	

}

package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Redirect_Link extends Base{
	
	
	WebDriver driver ;
	
	public Redirect_Link(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/redirector']")
	public WebElement Redirect_Link ;

	@FindBy(xpath="//a[@id='redirect']")
	public WebElement Click_here_to_Redirection  ;
	
	@FindBy(xpath="//a[@href='status_codes/200']")
	public WebElement  Status_Codes_200;
	
	@FindBy(xpath="//p[contains(text(),'This page returned a 200 status code.')]")
	public WebElement  Status200;
	
	@FindBy(xpath="//a[@href='status_codes/301']")
	public WebElement  Status_Codes_301;
	
	@FindBy(xpath="//p[contains(text(),'This page returned a 301 status code.')]")
	public WebElement  Status301;
	
	@FindBy(xpath="//a[@href='status_codes/404']")
	public WebElement Status_Codes_404 ;
	
	@FindBy(xpath="//p[contains(text(),'This page returned a 404 status code.')]")
	public WebElement Status404 ;
	
	@FindBy(xpath="//a[@href='status_codes/500']")
	public WebElement  Status_Codes_500;
	
	@FindBy(xpath="//p[contains(text(),'This page returned a 500 status code.')]")
	public WebElement  Status500;
	
	@FindBy(xpath="//a[@href='/status_codes']")
	public WebElement GOTO_status_codes ;
	
}

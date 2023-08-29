package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class EnteryExit extends Base{
	WebDriver driver ;
	
	
	public EnteryExit(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/entry_ad']")
	public WebElement Entery_Add ;

	@FindBy(xpath="//a[@id='restart-ad']")
	public WebElement  Link_To_re_enable;
	
	@FindBy(xpath="//p[normalize-space()='Close']")
	public WebElement Button_Close;
	
	@FindBy(xpath="//a[@href='/exit_intent']")
	public WebElement Exit_intent;

	@FindBy(xpath="//p[contains(text(),'Mouse out of the viewport pane and see a modal win')]")
	public WebElement Text;
	
	@FindBy(xpath="//p[contains(text(),'Close')]")
			public WebElement close;
	
}

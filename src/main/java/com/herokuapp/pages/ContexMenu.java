package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class ContexMenu extends Base {
WebDriver driver ; 
	
public ContexMenu(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//a[@href='/context_menu']")
public WebElement context_menu;
	
@FindBy(xpath="//div[@id='hot-spot']")
public WebElement right_click_menu;

}

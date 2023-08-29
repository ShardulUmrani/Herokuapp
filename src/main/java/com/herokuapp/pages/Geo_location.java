package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Geo_location extends Base{
	
	
	WebDriver driver ;
	
	public Geo_location(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/geolocation']")
	public WebElement Geo_location ;


	@FindBy(xpath="//button[@onclick='getLocation()']")
	public WebElement Button_Where_am_i_ ;
	
	@FindBy(xpath="//div[@id='lat-value']")
	public WebElement Button_Latitude ;
	
	@FindBy(xpath="//div[@id='long-value']")
	public WebElement Button_Longitude ;
	
	
	
	
}

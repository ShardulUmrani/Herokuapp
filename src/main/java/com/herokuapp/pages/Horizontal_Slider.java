package com.herokuapp.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Horizontal_Slider extends Base{
	
	
	WebDriver driver ;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public Horizontal_Slider(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/horizontal_slider']")
	public WebElement Horizontal_Slider ;
	
	
	@FindBy(xpath="//input[@onchange='showValue(this.value)']")
	public WebElement Slider_Bar ;
	
	@FindBy(xpath="//span[@id='range']")
	public WebElement Slider_Bar_2 ;
	

}

package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Nested_Frames extends Base{
	
	
	WebDriver driver ;
	
	public Nested_Frames(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/nested_frames']")
	public WebElement nested_frames ;

	//******Nested_frames**********
	
	@FindBy(xpath="//a[@href='/nested_frames']")
	public WebElement Nested_frames ;
	
	@FindBy(xpath="//frame[@name='frame-top']")
	public WebElement Nested_TOPframe ;
	
	@FindBy(xpath="//frame[@src='/frame_left']")
	public WebElement frame_LEFT;
	
	@FindBy(xpath="//frame[@src='/frame_middle']")
	public WebElement frame_middle;
	
	@FindBy(xpath="//frame[@src='/frame_right']")
	public WebElement frame_RIGHT;
	
	@FindBy(xpath="//frame[@src='/frame_bottom']")
	public WebElement frame_BOTTOM;

}

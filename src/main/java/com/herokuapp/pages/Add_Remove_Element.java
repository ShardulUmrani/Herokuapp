package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.utilities.CommonActions;


public class Add_Remove_Element extends Base {
	WebDriver driver;

	public Add_Remove_Element(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//a[normalize-space()='Add/Remove Elements']")
	public WebElement Add_Remove_Elements1;
	
	@FindBy(xpath="//button[@onclick='addElement()']")
	public WebElement Button_Add_Element;
	
	@FindBy(xpath="//button[@onclick='deleteElement()']")
	public WebElement Button_Delete_Element;
	
	@FindBy(xpath="//img[@src='/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']")
	public WebElement HRM;


	
 

	
	
}
	



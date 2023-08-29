package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class JQuery_UI_Menus extends Base{

	WebDriver driver ;
	
	public JQuery_UI_Menus(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/jqueryui/menu']")
	public WebElement  JQuery_UI_Menus;

	@FindBy(xpath="//a[text()='Enabled']")
	public WebElement  button_Enabled;
	
	@FindBy(xpath="//a[text()='Downloads']")
	public WebElement  Downloads;
	
	@FindBy(xpath="//a[@href='/download/jqueryui/menu/menu.pdf']")
	public WebElement  Downloads_PDF;
	
	@FindBy(xpath="//a[@href='/download/jqueryui/menu/menu.csv']")
	public WebElement  Downloads_CSV;
	
	@FindBy(xpath="//a[@href='/download/jqueryui/menu/menu.xls']")
	public WebElement  Downloads_Excel;
	
	@FindBy(xpath="//a[@href='/jqueryui']")
	public WebElement  Downloads_Back_to_Jquery_UI;
	
	@FindBy(xpath="//a[@href='/jqueryui/menu']")
	public WebElement Jquery_UI_Menu ;
	
}

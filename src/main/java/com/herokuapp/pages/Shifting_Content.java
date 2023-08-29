package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Shifting_Content extends Base{
	
	
	WebDriver driver ;
	
	public Shifting_Content(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
//********************
	
	@FindBy(xpath="//a[@href='/shifting_content']")
	public WebElement  Shifting_Content;
	
	@FindBy(xpath="//a[@href='/shifting_content/menu']")
	public WebElement  Example_1_Menu_Element;
	
	@FindBy(xpath="//a[@href='/about/']")
	public WebElement button_about;
	 
	@FindBy(xpath="//a[@href='/contact-us/']")
	public WebElement button_contact_us;
	
	@FindBy(xpath="//a[@href='/portfolio/']")
	public WebElement button_portfolio;
	
	@FindBy(xpath="//a[@href='/gallery/']")
	public WebElement button_gallery;
	
	@FindBy(xpath="//a[@href='/']")
	public WebElement button_Home;
	
	@FindBy(xpath="//a[@href='/shifting_content/menu?mode=random']")
	public WebElement  Link_Mode_random_click_here;
	
	@FindBy(xpath="//a[@href='/shifting_content/menu?pixel_shift=100']")
	public WebElement  Link_Pixel_shift_100;
	
	@FindBy(xpath="//a[@href='/shifting_content/menu?mode=random&pixel_shift=100']")
	public WebElement  Link_mode_random_pixel_shift_100;
	
	
	//********
	
	@FindBy(xpath="//a[@href='/shifting_content/image']")
	public WebElement  Example_2_An_image;
	
	@FindBy(xpath="//a[@href='/shifting_content/image?mode=random']")
	public WebElement Link_IMG_mode_random ;
	
	@FindBy(xpath="//a[@href='/shifting_content/image?pixel_shift=100']")
	public WebElement  Link_IMG_Pixel_shift_100;
	
	@FindBy(xpath="//a[@href='/shifting_content/image?mode=random&pixel_shift=100']")
	public WebElement  Link_IMG_mode_random_pixel_shift_100;
	
	@FindBy(xpath="//a[@href='/shifting_content/image?image_type=simple']")
	public WebElement image_type_simple ;
	
	
	@FindBy(xpath="//a[@href='/shifting_content/list']")
	public WebElement  _Example_3_List ;
}
	
	

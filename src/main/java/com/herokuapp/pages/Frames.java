package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.Base.Base;

public class Frames extends Base{
	
	
	WebDriver driver ;
	
	public Frames(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(xpath="//a[@href='/frames']")
	public WebElement Frames ;
	//a[@href='/frames']
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
	
	//******IFrame******************************
	
	@FindBy(xpath="//a[@href='/iframe']")
	public WebElement IFrame;
	
	@FindBy(xpath="//span[@class='tox-mbtn__select-label']")
	public WebElement Field_File;
	
	@FindBy(xpath="//div[@role='menuitem']")
	public WebElement Field__New_File;
	
	@FindBy(xpath="//span[normalize-space()='Edit']")
	public WebElement Field_Edit;
	
	@FindBy(xpath="//div[normalize-space()='Select all']")
	public WebElement Field_Edit_Select_all;
	
	@FindBy(xpath="//button[@class='tox-mbtn tox-mbtn--select tox-mbtn--active']")
	public WebElement Field_View;
	

	@FindBy(xpath="//span[text()='Format']")
	public WebElement Field_Format;
	
	@FindBy(xpath="//div[text()='Text color']")
	public WebElement Field_Text_color;
	
	@FindBy(xpath="//div[@title='Red']")
	public WebElement Field_Text_color_RED;
	
	@FindBy(xpath="//div[text()='Background color']")
	public WebElement Field_Background_color;
	
	@FindBy(xpath="//div[@title='Light Yellow']")
	public WebElement Field_Background_color_Yellow;
	
	@FindBy(xpath="//span[text()='Paragraph']")
	public WebElement Field_Paragraph;
	
	@FindBy(xpath="//div[contains(text(),'Headings')]")
	public WebElement Field_Headings;
	
	@FindBy(xpath="//h1[text()='Heading 1']")
	public WebElement Field_Headings_1;
	
	@FindBy(xpath="//h5[text()='Heading 5']")
	public WebElement Field_Headings_5;
	
	
	@FindBy(xpath="//span[@class='tox-tbtn__select-label']")
	public WebElement Field_Headings_5_dropdown;
	
	@FindBy(xpath="//button[@title='Bold']")
	public WebElement Field_Bold;

	@FindBy(xpath="//button[@title='Italic']")
	public WebElement Field__Tilt;
	
	@FindBy(xpath="//button[@title='Align left']")
	public WebElement Field_FontLine_Left_side;
	
	@FindBy(xpath="//button[@title='Align center']")
	public WebElement Field_FontLine_Middle;
	
	@FindBy(xpath="//button[@title='Align right']")
	public WebElement Field_FontLine_Right_Side;
	
	@FindBy(xpath="//button[@title='Justify']")
	public WebElement Field_FoantLine_standard;
	
	@FindBy(xpath="//button[@title='Increase indent']")
	public WebElement Field_Forward_side;

	@FindBy(xpath="//button[@title='Decrease indent']")
	public WebElement Field_Backword_Side;

	@FindBy(xpath="//button[@aria-label='Undo']")
	public WebElement Field_Undo_Button;
	
	@FindBy(xpath="//button[@aria-label='Redo']")
	public WebElement Field_Redo_Button;
	
	@FindBy(xpath=" //p[normalize-space()='Your content goes here.']")
	public WebElement Field_Enter_Text;
	
	@FindBy(tagName="p")
	public WebElement Text_in_paragraph;
	
	@FindBy(xpath="//body[@id='tinymce']")
	public WebElement paragraphtext;
	
	@FindBy(xpath="//div[@role='menubar']")
	public WebElement Menubar;
	

}

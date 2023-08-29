package com.herokuapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Frames;
import com.herokuapp.utilities.CommonActions;

public class Test_Frames extends Base{
	
 @Test(description ="To Validate Nested Frames Element" )
	
	public void Frames() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Frames F=new Frames(driver);

		F.Frames.click();
        F.Nested_frames.click();
        
        driver.switchTo().frame(F.Nested_TOPframe).switchTo().frame(F.frame_LEFT);            
        driver.switchTo().frame(F.Nested_TOPframe).switchTo().frame(F.frame_RIGHT);
        driver.switchTo().frame(F.Nested_TOPframe).switchTo().frame(F.frame_middle);
        driver.switchTo().frame(F.Nested_TOPframe).switchTo().frame(F.frame_BOTTOM);
        
        
 }

        @Test(description ="To Validate iFrame Frames Element" )
    	
    	public void iFrame() {
    		
    		CommonActions C = new CommonActions();
    		Actions A=new Actions(driver);
    		Frames F=new Frames(driver);

    	F.Frames.click();
    	F.IFrame.click();
    	
    	//F.Field_Enter_Text.sendKeys("Automation Testing");
    	F.Field_Edit.click();
    	F.Field_Edit_Select_all.click();
    	
    	C.wait(2000);
    	F.Field_Paragraph.click();
    	F.Field_Headings.click();
    	F.Field_Headings_5.click();
    	C.wait(2000);
    	F.Field_Headings_5_dropdown.click();
    	F.Field_Headings.click();
    	F.Field_Headings_1.click();
    	
    	F.Menubar.click();
    	C.wait(2000);
    	F.Field_Format.click();
    	F.Field_Background_color.click();
    	F.Field_Background_color_Yellow.click();
    	C.wait(2000);
    	F.Field_Format.click();
    	F.Field_Text_color.click();
    	F.Field_Text_color_RED.click();
    	
    	
    	F.Field_Edit.click();
    	F.Field_Edit_Select_all.click();
    	F.Field_Bold.click();
    	F.Field__Tilt.click();
    	C.wait(2000);
    	F.Field_FontLine_Right_Side.click();
    	C.wait(2000);
        F.Field_FontLine_Left_side.click();
        C.wait(2000);
        F.Field_FontLine_Middle.click();
        C.wait(2000);
        F.Field_FoantLine_standard.click();
        C.wait(2000);
        F.Field_Backword_Side.click();
        C.wait(2000);
        F.Field_Forward_side.click();
}}

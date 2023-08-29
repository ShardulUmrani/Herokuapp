package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Frames;
import com.herokuapp.pages.WYSIWYG_Editor;
import com.herokuapp.utilities.CommonActions;

public class Test_WYSIWYG_Editor extends Base{
	
 @Test(groups={"sanity"},description ="To Validate WYSIWYG_Editor Element" )
	
	public void WYSIWYG_Editor() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		WYSIWYG_Editor F=new WYSIWYG_Editor(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",F.WYSIWYG_Editor11);

	C.click_on_Element(F.WYSIWYG_Editor11);
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

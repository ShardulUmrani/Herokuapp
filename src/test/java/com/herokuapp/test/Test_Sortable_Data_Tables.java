package com.herokuapp.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Sortable_Data_Tables;
import com.herokuapp.utilities.CommonActions;

public class Test_Sortable_Data_Tables extends Base{
	
 @Test(description ="To Validate Sortable_Data_Tables Element" )
	
	public void Sortable_Data_Tables() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Sortable_Data_Tables S=new Sortable_Data_Tables(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",S.Sortable_Data_Tables );

        C.click_on_Element(S.Sortable_Data_Tables);
        System.out.println(S.Data_Tables.getText()+" Before Click on table");
        C.click_on_Element(S.Sortable_Data_Tables2);
        System.out.println(S.Data_Tables.getText()+" After Click on table");
		
}}

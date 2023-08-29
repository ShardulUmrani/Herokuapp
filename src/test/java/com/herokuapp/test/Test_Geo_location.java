package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.Geo_location;
import com.herokuapp.utilities.CommonActions;

public class Test_Geo_location extends Base{
	
 @Test(description ="To Validate Geo_location Element" )
	
	public void Geo_location() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		Geo_location G=new Geo_location(driver);
		
		C.click_on_Element(G.Geo_location);
		C.click_on_Element(G.Button_Where_am_i_);
		System.out.println(C.getText(G.Button_Latitude)+"= Latitude ");
		System.out.println(C.getText(G.Button_Longitude)+"= Longitude ");
		
	
		
		
		
}}

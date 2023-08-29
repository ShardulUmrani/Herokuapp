package com.herokuapp.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.utilities.CommonActions;
import com.herokuapp.pages.BasicAuthlogin;

public class Test_BasicAuth extends Base {
	
	
@Test(description="To Validate Basic Auth Elements")
	
	public void BasicAuth(){

	CommonActions C = new CommonActions();
	BasicAuthlogin B =new BasicAuthlogin(driver);
	C.wait(2000);
	C.click_on_Element(B.basic_auth_login);
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	C.performRefresh();
			
			

	

}}

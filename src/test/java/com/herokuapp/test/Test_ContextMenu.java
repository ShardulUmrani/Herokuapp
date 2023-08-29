package com.herokuapp.test;



import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.utilities.CommonActions;
import com.herokuapp.pages.ContexMenu;
import org.openqa.selenium.interactions.Actions;

public class Test_ContextMenu extends Base {
	
	@Test(description ="To Validate Context Menu Element" )
	
	public void contextmenu() {
		
		CommonActions C = new CommonActions();
		ContexMenu Co=new ContexMenu (driver);
		Actions A=new Actions(driver);
		
		C.click_on_Element(Co.context_menu);
		A.contextClick(Co.right_click_menu).perform();
		
	}

}

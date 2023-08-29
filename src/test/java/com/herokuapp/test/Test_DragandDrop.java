package com.herokuapp.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.herokuapp.Base.Base;
import com.herokuapp.pages.DragandDrop;
import com.herokuapp.utilities.CommonActions;

public class Test_DragandDrop extends Base{
	
@Test(description ="To Validate DragandDrop Element" )
	
	public void DragandDrop() {
		
		CommonActions C = new CommonActions();
		Actions A=new Actions(driver);
		DragandDrop D=new DragandDrop(driver);
		
		C.click_on_Element(D.drag_and_drop);
		A.dragAndDrop(D.Column_A, D.Column_B).build().perform();
		C.wait(3000);
		A.dragAndDrop(D.Column_B, D.Column_A).build().perform();
	
}

}

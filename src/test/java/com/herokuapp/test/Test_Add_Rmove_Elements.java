package com.herokuapp.test;

import org.testng.annotations.Test;
import com.herokuapp.utilities.CommonActions;
import com.herokuapp.Base.Base;
import com.herokuapp.pages.Add_Remove_Element;

public class Test_Add_Rmove_Elements extends Base {
	
	

@Test(description="To Validate Add/Remove Elements")
	
	public void AddRemove(){

	CommonActions C = new CommonActions();

	Add_Remove_Element A= new Add_Remove_Element(driver);
	
	C.click_on_Element(A.Add_Remove_Elements1);
	C.click_on_Element(A.Button_Add_Element);
	//C.wait(2000);
    C.click_on_Element(A.Button_Delete_Element);
	
	
}
	
@Test(description="second TC to see run or not")
	
        public void Add(){

	CommonActions C = new CommonActions();

	System.out.println("second TC to see run or not  ");
	
}}

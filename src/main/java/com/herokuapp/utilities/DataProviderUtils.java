package com.herokuapp.utilities;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;



public class DataProviderUtils {
private static List<Map<String, String>> list = new ArrayList<>();
	
	@DataProvider
	public static Object[] getData(Method m) {
		
		String testname = m.getName();
		if(list.isEmpty()) {
			list = ExcelUtils.getTestDetails("TestData");
		}
		List<Map<String, String>> smalllist = new ArrayList<>();
		
		for(int i=0; i<list.size();i++) {
			
			if(list.get(i).get("Test Name").equalsIgnoreCase(testname)) {
				if(list.get(i).get("Execute").equalsIgnoreCase("Yes")) {
					smalllist.add(list.get(i));	
				}
			}
			
		} 
		return smalllist.toArray();
		
	}

}

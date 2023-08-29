package com.herokuapp.utilities;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import com.herokuapp.Base.Base;

public class PropertiesReader extends Base{
	
	
	public static String getValue(String key) throws IOException {
		String path = System.getProperty("user.dir") + "\\application.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	

}

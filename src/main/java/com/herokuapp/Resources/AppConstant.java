package com.herokuapp.Resources;

public class AppConstant {
	private AppConstant() {
		throw new IllegalStateException("AppConstant class");
		
	}
	
	private static final String User_Directory =  System.getProperty("user.dir");
	private static final String SparkReportPath = System.getProperty("user.dir") + "\\Reports\\SparkReport.html";
	private static final String ArcheiveSparkReportPath = System.getProperty("user.dir") + "\\Reports\\archive\\Spark Report"; 
	private static final String ExcelTestDataPath = System.getProperty("user.dir") + "\\Roopkala\\test-data\\RoopkalaTestdata.xlsx";
	private static final String PropertiesFilePath = System.getProperty("user.dir") + "\\application.properties";
	
	
	public static String getsparkreportPath() {
		return SparkReportPath;
	}
	
	
	public static String getPropfilepath() {
		return PropertiesFilePath;
	}

	public static String getUserDirectory() {
		return User_Directory;
	}

	public static String getarcheiveSparkReportPath() {
		return ArcheiveSparkReportPath;
	}
	
	public static String getexcelTestDataPath() {
		return ExcelTestDataPath;
	}

}

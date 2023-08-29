package com.herokuapp.Base;

import java.awt.Desktop;
import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.herokuapp.Base.Base;
import com.herokuapp.Resources.AppConstant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	private Logger logger = LoggerFactory.getLogger(Base.class);
	
	@BeforeClass
	public void chrome () {
		
	
	//	WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		

	  WebDriverManager.edgedriver().setup();
	   driver = new EdgeDriver();
		
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
/*
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	@AfterSuite(alwaysRun=true)
	public void openReport() {
		
			try {
				File reportFile = new File(AppConstant.getsparkreportPath());
				Desktop desktop = Desktop.getDesktop();
				if(reportFile.exists()) {
				desktop.open(reportFile);}
				
				//Backing up current report file with current time-stamp
				LocalDateTime myDate = LocalDateTime.now();
				DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss");
				String dt = myDate.format(dateTime);
				
				File reportBackup = new File(AppConstant.getarcheiveSparkReportPath() + "_" + dt + ".html");
				
				FileUtils.copyFile(reportFile, reportBackup);
				
			} catch (Exception e) {
				e.printStackTrace();
				Assert.fail("", e.getCause());
			} 
		}

	
	
	
	*/
	
	
	
}

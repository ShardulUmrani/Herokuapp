package com.herokuapp.utilities;



import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.herokuapp.Base.Base;
import com.herokuapp.Resources.AppConstant;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ListnerUtility extends Base implements ITestListener {
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter(AppConstant.getsparkreportPath());
	private Logger logger = LoggerFactory.getLogger(ListnerUtility.class);
	
	@Override
	public void onStart(ITestContext context) {
		extent.attachReporter(spark);
		spark.config().setReportName("HerokuApp Result");
		spark.config().setDocumentTitle("HerokuApp Test Result");
		spark.config().setTheme(Theme.DARK);
		spark.config().setTimeStampFormat("MMMM dd, yyyy HH:mm:ss");
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
	logger.info("****Started Execuation of : >"  + result.getMethod().getDescription());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	logger.info(result.getMethod().getDescription() + ": Test Case Execuate Successfully");
	ExtentTest test = extent.createTest(result.getMethod().getDescription());
	test.pass(result.getMethod().getDescription());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Capturing the screenshot : " + result.getMethod().getDescription());
		ExtentTest test = extent.createTest(result.getMethod().getDescription());	
		test.fail(result.getMethod().getMethodName()).addScreenCaptureFromBase64String(ScreenshotUtil.getBase64img(driver));
		test.fail(result.getMethod().getDescription());
		test.log(Status.FAIL, result.getThrowable());
		
		CommonActions commonactions = new CommonActions();
		commonactions.wait(5000);
		try {
			String browserName = PropertiesReader.getValue("browserType");
			if(browserName.equalsIgnoreCase("chrome") || browserName.equalsIgnoreCase("edge") 
					||browserName.equalsIgnoreCase("firefox")) {
			driver.quit();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	logger.info(result.getMethod().getMethodName() + " :"+ "Test Case Skip");
	ExtentTest test = extent.createTest(result.getMethod().getDescription());
	test.skip(result.getMethod().getDescription());
	test.log(Status.SKIP, result.getThrowable());
	driver.quit();
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		/*
		 * We are not using this method currently.
		 */
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		//extent.flush() instructs ExtentReports write the test information to a destination.
		extent.flush();
		
	}
	
	

}

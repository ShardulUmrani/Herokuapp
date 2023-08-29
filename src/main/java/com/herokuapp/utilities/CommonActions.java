package com.herokuapp.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.herokuapp.Base.Base;

public class CommonActions extends Base{
	
private Logger logger = LoggerFactory.getLogger(CommonActions.class);
	
	public void enters_data(String value, WebElement element) {
		highlightElement(element);
		logger.info("Entering text : " + value);
		element.clear();
		element.sendKeys(value);     
	}
	

	public void click_on_Element( WebElement element) {
		logger.info("Clicking on : " + element.getText());
		highlightElement(element);
		element.click();
		
	}
	
	
	
	public void scrolldown( WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
		
	}
	
public void scrollup( WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); 
		
	}
	
	public void clickUsingJs(WebElement element) {
		wait(2000);
		visibilityOfelement(element);
		
		if(element.isDisplayed() && element.isEnabled()) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			logger.info("Click using JS on " + element.getText());
			highlightElement(element);
			js.executeScript("argument[0].click();", element);
		}
		wait(2000);
	}
	
	public void moveToAndClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click(element).build().perform();
	}
	
	public String getTitle(WebDriver driver) {
		String title = driver.getTitle();
		System.out.println("Title of Page : " + title);
		return title;
	}

	public static void navigateBack() {
		driver.navigate().back();
	}
	
	public static void performRefresh() {
		driver.navigate().refresh();
	}
	
	public void wait(int milliseconds) {
		try {
			logger.info("wait for seconds : " + milliseconds);
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			Assert.fail(e.getLocalizedMessage());
			Thread.currentThread().interrupt();		}
	}
	
	
	public void waitFor_ElementVisibility(By value) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(value));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean visibilityOfelement( WebElement element) {
		logger.info("Element visible on screen : " + element.getText());
		return element.isDisplayed();
	}
	
	private void highlightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='2px dashed red'", element);
	}
	
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	
	
	
	
	

}



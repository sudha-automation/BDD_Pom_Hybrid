package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util.ExplicitWait;

public class LoginPage {
	
	private WebDriver driver;
	
	private By Element =  By.xpath("//h5[text()='Elements']/parent::div[@class='card-body']");
	private By Forms =  By.xpath("//h5[text()='Forms']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean isElementsPresent() {
		return driver.findElement(Element).isDisplayed();
		
	}
	public boolean isFormsPresent() {
		return driver.findElement(Forms).isDisplayed();
	}
	 public void clickElement() {
		 //implicit wait 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 //ExplicitWait ExWait = new ExplicitWait(driver,1000);
		 WebDriverWait wait  = new WebDriverWait(driver,5000);
		 //ExWait.EleToBeClickable(Element);
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Element)));
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 //js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(Element));
		 js.executeScript("arguments[0].click();",driver.findElement(Element));
		 
		 //driver.findElement(Element).click();
		 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	 }
}

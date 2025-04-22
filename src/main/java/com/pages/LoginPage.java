package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	private By Element =  By.xpath("//h5[text()='Elements']");
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
		 driver.findElement(Element).click();
	 }
}

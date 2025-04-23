package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {

	 private WebDriver driver;
	 private String str;
	private By WebtableLink = By.xpath("//span[.='Web Tables']");
	private By WebTableheader = By.xpath("//h1[.='Web Tables']");
	
	public ElementsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void WTClick() {
		driver.findElement(WebtableLink).click();
	}
	
	public boolean validateWTheader() {
		return driver.findElement(WebTableheader).isDisplayed();
	}
	
	public WebElement getFirstname(String name) {
		return driver.findElement(By.xpath("//div[.='"+name+"']"));
	}
	
	public String getEmailAddress(WebElement element) {
		
		 return driver.findElement(By.xpath(element+"/following-sibling::div[contains(text(),'.com')]")).getText();
	}
	
	
}

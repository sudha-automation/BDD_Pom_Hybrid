package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	WebDriver driver;
	int duration;
	public ExplicitWait(WebDriver driver, int duaration) {
		this.driver = driver;
		this.duration = duration;
	}
	WebDriverWait wait  = new WebDriverWait(driver,duration);
	
	public void EleToBeClickable(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}

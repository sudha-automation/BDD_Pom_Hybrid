package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	//public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public WebDriver initDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		tlDriver.set(new ChromeDriver()) ;
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver()) ;
			}
		else if(browser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			tlDriver.set(new SafariDriver()) ;
			}
		else {
			System.out.println("please pass correct browser"+browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}

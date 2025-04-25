package appHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.qa.factory.DriverFactory;
import com.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	private DriverFactory driverfactory;
	private WebDriver driver;
	public ConfigReader configreader;
	Properties prop;
	
	
	@Before(order = 0)
	public void getProeprty() {
		
		configreader= new ConfigReader();
		prop = configreader.init_prop();
		}
	@Before(order = 1)
	public void LaunchBrowser() {
		String browsername = prop.getProperty("browser");
		driverfactory = new DriverFactory();
		driver = driverfactory.initDriver(browsername);
		driver.get("https://demoqa.com");
	}
	@After(order = 0)
	public void QuitBrowser() {
		driver.quit();
	}
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			String screenshotname = scenario.getName().replace(" ", "_");
			byte [] sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshotname);
			
		}
			
	}
	
}

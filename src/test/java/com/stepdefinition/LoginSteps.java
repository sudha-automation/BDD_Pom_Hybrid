package com.stepdefinition;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
@Given("user is in login")
public void user_is_in_login() {
   DriverFactory.getDriver().get("https://demoqa.com");
   DriverFactory.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}

@When("Validate element")
public void Validate_element() {
loginpage.isElementsPresent();
}

@Then("vaidate title is {string}")
public void vaidate_title_is(String string) {
	Assert.assertTrue((loginpage.getTitle()).equalsIgnoreCase(string));
}

@When("Click on Elements")
public void click_on_elements() {
   loginpage.clickElement();
}

@When("Click on Elements Header")
public void click_on_elements_header() {
	   loginpage.clickElement();

}
	
}

package com.stepdefinition;

import org.junit.Assert;

import com.pages.ElementsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElementsSteps {
	 private ElementsPage Elementspage = new ElementsPage(DriverFactory.getDriver());
	

@When("User click on Web Tables")
public void user_click_on_web_tables() {
 Elementspage.WTClick();
}

@When("user validate text Web Tables")
public void user_validate_text_web_tables() {
    Assert.assertTrue(Elementspage.validateWTheader());
    
}

@Then("User reads email address for the following users")
public void user_reads_email_address_for_the_following_users(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    throw new io.cucumber.java.PendingException();
}	





}

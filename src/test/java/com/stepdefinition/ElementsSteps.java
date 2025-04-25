package com.stepdefinition;

import java.util.List;
import java.util.Map;

//import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import com.pages.ElementsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ElementsSteps {
	 private ElementsPage Elementspage = new ElementsPage(DriverFactory.getDriver());
	 //SoftAssertions softassert = new SoftAssertions();

@When("User click on Web Tables")
public void user_click_on_web_tables() {
	//softassert.assertThat(false);
	System.out.println("print statement after Soft Assert fails");
 Elementspage.WTClick();
 //softassert.assertAll();
}

@When("user validate text Web Tables")
public void user_validate_text_web_tables() {
	//Assert.assertTrue(false);
	//System.out.println("print statement after Hard Assert fails");
    Assert.assertTrue(Elementspage.validateWTheader());
    
}

@Then("User reads email address for the following users")
public void user_reads_email_address_for_the_following_users(io.cucumber.datatable.DataTable dataTable) {
//using List fr data table
	/*
	for (List<String> e:datatableAsList) {
		System.out.println(e);
		for(String s:e) {
			System.out.println("separated "+s);
		}*/
	//Using Map for data table
	
	List<Map<String,String>> data = dataTable.asMaps();
	for(Map<String,String> m:data) {
		System.out.println(m.get("User"));
		System.out.println(m.get("email"));
	}
}	





}

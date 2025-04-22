package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/recources/com/features"},
		glue= {"com.stepdefinition","appHooks"},
		plugin= {"pretty"}
		)
public class TestRunner {

	
}

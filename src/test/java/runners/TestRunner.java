package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\HP\\eclipse-workspace\\2022\\2023\\Cucumber_s2\\src\\test\\resources\\Login.feature",
		glue = {"stepDefintion"},
		dryRun = false,
		plugin = {"pretty",
				  "html:target/TestreportToday.html"}, 
		monochrome = true )

public class TestRunner {

}

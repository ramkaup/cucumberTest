package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Java\\GitRepo\\cucumberTest\\src\\main\\java\\features\\googleSearch.feature",
		glue = "stepDefination"
		)
public class TestRuner {






}

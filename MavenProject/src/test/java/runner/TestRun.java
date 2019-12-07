package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/featuress/login.feature",
                             glue="stepss",	plugin = {  "pretty", "json:target/cucumber-reports/Cucumber.json"})
                            		 


public class TestRun extends AbstractTestNGCucumberTests
{

}

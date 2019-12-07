package tRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/CreateLead.feature",
							glue="steps",
							monochrome=true,
							plugin = {  "pretty", "json:target/cucumber-reports/Cucumber.json" })
					/*dryRun=true,snippets = SnippetType.CAMELCASE*/


public class TestRunner extends AbstractTestNGCucumberTests{

}
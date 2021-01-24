package com.MyPracticeCucumber.GetWithTags;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		tags={"@Important"}, //All scenario executed if this is tag for feature file
		//tags={"@Smoke"}, //only tag with @Smoke
		//tags={"@Smoke and @Regression"}, //AND condition
		//tags={"@Smoke or @Regression"} , // OR condiction
		//tags = {"not @Smoke"},  // this will exclude the scenario with @SmokeTest
		features = {"src/test/resources/com/GetWithTagsFF/GetRequestWithTags.feature"},
		glue ={"com.basic.GetWithTags"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report4.json"
		}

		)

public class RunnerGetWithTags {
	
	
	
}

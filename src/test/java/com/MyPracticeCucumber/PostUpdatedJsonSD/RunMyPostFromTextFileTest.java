package com.MyPracticeCucumber.PostUpdatedJsonSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/resources/com/PostStringJSONFF/PostUpdatedJson.feature"},
			glue={"com.MyPracticeCucumber.PostUpdatedJsonSD"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report8.json"
			}
		)
		

public class RunMyPostFromTextFileTest {


}
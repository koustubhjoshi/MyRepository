package com.MyPracticeCucumber.PostStringJSON;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/PostStringJSONFF/PostFromTextFile.feature"},
		glue={"com.MyPracticeCucumber.PostStringJSON"},
		monochrome=true,
		dryRun=false,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report7.json"
		}
		
		)

public class RunMyPostFromTextFileTest {


}

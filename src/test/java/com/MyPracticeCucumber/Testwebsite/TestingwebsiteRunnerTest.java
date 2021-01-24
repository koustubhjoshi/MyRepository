package com.MyPracticeCucumber.Testwebsite;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/TestwebsiteFF/testwebsiteFF.feature"},
		glue={"com.MyPracticeCucumber.Testwebsite"},
		monochrome =true,
		//dryRun = true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report51131.json"
				
		}
		
		)
public class TestingwebsiteRunnerTest {
	
	

}

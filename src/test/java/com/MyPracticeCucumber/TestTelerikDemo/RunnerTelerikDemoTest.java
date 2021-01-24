package com.MyPracticeCucumber.TestTelerikDemo;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/TelerikDemoFF/testTelerikDemo.feature"},
		glue={"com.MyPracticeCucumber.TestTelerikDemo"},
		monochrome =true,
		//dryRun = true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report51131.json"
				
		}

		
		)

public class RunnerTelerikDemoTest {

}

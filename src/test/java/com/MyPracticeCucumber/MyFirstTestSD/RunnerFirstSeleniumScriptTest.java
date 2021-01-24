package com.MyPracticeCucumber.MyFirstTestSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/MyFirstTestFF/FirstSeleniumScriptFF.feature"},
				//"src/test/resources/com/basic/MyFirstSelenium/FirstSeleniumScriptFF2.feature"},
		glue={"com/MyPracticeCucumber/MyFirstTestSD/"},
		//dryRun = true,
		monochrome = true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report51131.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
		)

public class RunnerFirstSeleniumScriptTest {

}

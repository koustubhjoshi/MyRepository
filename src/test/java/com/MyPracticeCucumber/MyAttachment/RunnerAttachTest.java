package com.MyPracticeCucumber.MyAttachment;

//import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/MyAttachmentFF/Attachment.feature"},
				//"src/test/resources/com/basic/MyFirstSelenium/FirstSeleniumScriptFF2.feature"},
		glue={"com.MyPracticeCucumber.MyAttachment"},
		//dryRun = true,
		monochrome = true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report51131.json"
		}

		
		)

public class RunnerAttachTest {

}

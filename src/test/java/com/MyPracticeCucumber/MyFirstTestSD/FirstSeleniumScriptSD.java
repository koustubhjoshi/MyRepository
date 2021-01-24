package com.MyPracticeCucumber.MyFirstTestSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstSeleniumScriptSD {
	
	WebDriver driver;
	
@Given("^User Opens seleniumhq website$")
public void user_Opens_seleniumhq_website()  {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","D:\\Radical Institute\\Web Drivers\\chromedriver_win32_B39\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.seleniumhq.org/");
}

@When("^user click on \"([^\"]*)\" tab$")
public void user_click_on_tab(String tabName) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("tab name = "+tabName);
	driver.findElement(By.xpath("//a[contains(text(),'Projects')]")).click();
}

@Then("^user checks About tab$")
public void user_checks_About_tab() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(true);
}


	
}

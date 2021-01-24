package com.MyPracticeCucumber.TestTelerikDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TelerikDemoSD {
	
	WebDriver driver;

	@Given("^User hit the telerik site$")
	public void user_hit_the_telerik_site() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\Radical Institute\\Web Drivers\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
		Thread.sleep(1000);
	
	    
	}

	@When("^User move \"([^\"]*)\" country from source to destination$")
	public void user_move_country_from_source_to_destination(String Scountry) throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_RadListBoxSource']//ul/li[text()='"+Scountry+"']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/ul/li/button[@title='To Right']/Span[1]")).click();
	}

	
	
	@Then("^User check the \"([^\"]*)\" country is moved successfully to destination$")
	public void user_check_the_country_is_moved_successfully_to_destination(String Dcountry) {
	    // Write code here that turns the phrase above into concrete actions
	    
		try{
			
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_RadListBoxSource']//ul/li[text()='"+Dcountry+"']"));
		}catch(Exception e){
			System.out.println(Dcountry +":This Country is not present at source");
		}
	}

}	



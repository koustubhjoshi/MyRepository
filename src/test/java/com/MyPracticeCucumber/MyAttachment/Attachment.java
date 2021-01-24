package com.MyPracticeCucumber.MyAttachment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Attachment {
	
	WebDriver driver;
	
	@Given("^User Opens registration website$")
	public void user_Opens_registration_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    		System.setProperty("webdriver.chrome.driver","D:\\Radical Institute\\Web Drivers\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("^User attach the attachment$")
	public void user_attach_the_attachment() throws InterruptedException, AWTException {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.xpath("//div/input[@id='imagesrc']")).click();
		Thread.sleep(2000);
		StringSelection ss = new StringSelection("D:\\Radical Institute\\Attachments\\SamplePic.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot =new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}

	@Then("^Verify attachment is present$")
	public void verify_attachment_is_present() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}

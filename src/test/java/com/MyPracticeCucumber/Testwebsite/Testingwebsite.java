package com.MyPracticeCucumber.Testwebsite;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Testingwebsite {
	
	String url=null;
	Response res=null;
	
	@Given("^I have website link$")
	public void i_have_website_link() {
		url="http://www.google.com/";
		System.out.println("Google link is avaiable");
	}

	@When("^I hit website link$")
	public void i_hit_website_link()
	{
		res = RestAssured.get(url);
		System.out.println("Hi Google URL");
	}

	@Then("^I check it is up and running$")
	public void i_check_it_is_up_and_running() 
	{
		System.out.println("Checking the google URL");
		int stcode=res.getStatusCode();
		System.out.println("status code = " + stcode);
		if (stcode==200)
		{
			System.out.println("website is up and running");
		}
		else{
			System.out.println("website is not up and running");
		}
			
	}

}

package com.MyPracticeCucumber.PostUpdatedJsonSD;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;

public class MyPostFromTextFile {
	 
	Response resp ;
	
	//@Given("^user hit the post request with \"([^\"]*)\" name$")
	@Given("user hit the post request with {string} name")
	public void user_hit_the_post_request_with_json_data(String username) throws IOException, JSONException{
		
		//Read data from file
		String data = ""; 
	    data = new String(Files.readAllBytes(Paths.get("src/test/resources/com/PostStringJSONFF/user.json"))); 
	    System.out.println("json in String ==== " +data);
	    
	    //Update the data
	    JSONObject object=new JSONObject(data);
	    object.put("name", username);
	    //object.put("job", username);
	    String newJsonStr = object.toString();
	    System.out.println("json in String ==== " +newJsonStr);
	    
	    //Do POST request
	    resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
				when().body(newJsonStr).post("https://reqres.in/api/users");
	}
	
	@Then("user validate the id is not null")
	public void user_validate_the_id_is_not_null(){
		
		//Check id is not null
		resp.then().assertThat().body("id", notNullValue());
		
		//check id is greater than zero
		String idValue = resp.getBody().jsonPath().get("id");
		int idInt = Integer.parseInt(idValue);
		Assert.assertTrue(idInt > 0);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
 
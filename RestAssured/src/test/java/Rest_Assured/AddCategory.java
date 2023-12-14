package Rest_Assured;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddCategory {
@Test
public void addCategory() {
	JSONObject type=new JSONObject();
	type.put("CategoryName","testewfing123");
	type.put("CategoryCode","T033");
	type.put("CreatedById", 8);
	
	Response res=given()
			.header("Authorization","Bearer "+EndPoints.token)
			.contentType(ContentType.JSON)
			.body(type)
			
			.when()
			.post(EndPoints.addCategory);
	
	Assert.assertEquals(res.getStatusCode(),200);
	System.out.println(res.getBody().asString());
}
}

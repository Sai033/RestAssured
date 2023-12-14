package Rest_Assured;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TypesList {
	@Test
	public void list() {
	JSONObject type=new JSONObject();
	type.put("?subCatId","28(pass parameters in params)");
	
	Response res=given()
			.header("Authorization","Bearer "+EndPoints.token)
			.contentType(ContentType.JSON)
			.body(type)
			
			.when()
			.get(EndPoints.typesList);
	
	Assert.assertEquals(res.getStatusCode(),200);
	System.out.println(res.getBody().asString());
}
}

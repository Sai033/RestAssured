package Rest_Assured;

import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddSubCategory {
	@Test
	public void addSubCategory() {
	JSONObject type=new JSONObject();
	type.put("subCategoryName","biscudsits");
	type.put("subCategoryCode","stadsa123");
	type.put("categoryid",86);
	type.put("CreatedById",1);
	
	Response res=given()
			.header("Authorization","Bearer "+EndPoints.token)
			.contentType(ContentType.JSON)
			.body(type)
			
			.when()
			.post(EndPoints.addSbuCategory);
	
	Assert.assertEquals(res.getStatusCode(),200);
	System.out.println(res.getBody().asString());
}
}

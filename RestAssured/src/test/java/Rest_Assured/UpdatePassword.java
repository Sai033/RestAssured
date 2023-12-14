package Rest_Assured;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class UpdatePassword {
@Test
public void updatepwd() {

JSONObject credentials=new JSONObject();
credentials.put("UserId",321);
credentials.put("currentPassword","asdf123");
credentials.put("newPassword","asdf123");
	
           Response res=given()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer "+EndPoints.token)
			.body(credentials)
          .when()
           .post(EndPoints.updatpwd);
           
          System.out.println(res.getBody().asString());
          Assert.assertEquals(res.getStatusCode(),200);
          Assert.assertEquals(res.jsonPath().get("succeded"),true);
          System.out.println(res.time()+"-->Response time");
          
          
}}

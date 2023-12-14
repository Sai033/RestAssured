package Rest_Assured;

import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Forgetpwd {
@Test
public void forgetpassword() {

JSONObject userName=new JSONObject();
userName.put("username","Laxmikanth");
	given()
			.contentType(ContentType.JSON)
			.header("Authorization","Bearer "+EndPoints.token)
			.body(userName)
		.when()
		 .post(EndPoints.forgetPassword)
	  .then()
	   .log().all();
			
}
}

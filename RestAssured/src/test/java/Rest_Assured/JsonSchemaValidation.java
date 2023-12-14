package Rest_Assured;

import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.module.jsv.JsonSchemaValidator;
import java.util.List;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.Argument;

public class JsonSchemaValidation {
@Test
public void test() {
	JSONObject obj=new JSONObject();
	obj.put("catid","2 (pass parameters in params)");
	
	       given()
			.header("Authorization","Bearer "+EndPoints.token)
			.contentType(ContentType.JSON)
			.body(obj)
			
			
			.when()
			.get(EndPoints.categoryList)
			.then()
			.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonSchema.json"));
	       
	
	
	
}


}

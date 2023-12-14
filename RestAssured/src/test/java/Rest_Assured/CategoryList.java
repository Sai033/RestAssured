package Rest_Assured;

import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryList {
@Test
public void getCategoryList() {
	JSONObject obj=new JSONObject();
	obj.put("catid","2 (pass parameters in params)");
	
	Response res=given()
			.header("Authorization","Bearer "+EndPoints.token)
			.contentType(ContentType.JSON)
			.body(obj)
			
			.when()
			.get(EndPoints.categoryList);
	
	Assert.assertEquals(res.getStatusCode(),200);
	System.out.println(res.getBody().asString());
	Assert.assertEquals(res.jsonPath().get("response.firstCat.subCAts.firstSubCat.types[1].typeName"),"Housekeeping materials(dgdgdgd)");
    String q=(res.jsonPath().get("response.firstCat.catName")).toString();
    System.out.println(q);
}
}


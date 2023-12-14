package Rest_Assured;

import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
	import io.restassured.response.Response;

	public class PrintJsonData {

	    public static void main(String[] args) {
	    	JSONObject obj=new JSONObject();
	    	obj.put("catid","2 (pass parameters in params)");
	    	
	    	Response res=given()
	    			.header("Authorization","Bearer "+EndPoints.token)
	    			.contentType(ContentType.JSON)
	    			.body(obj)
	    			
	    			.when()
	    			.get(EndPoints.categoryList);
	    	JsonPath jsonPath=res.jsonPath();
	    	    List<String> typeNames = jsonPath.getList("response.firstCat.subCAts.firstSubCat.types.typeName");

	        // Print all type names
	        System.out.println("Type Names:");
	        for (String typeName : typeNames) {
	            System.out.println(typeName);
	        }
	    }
	}


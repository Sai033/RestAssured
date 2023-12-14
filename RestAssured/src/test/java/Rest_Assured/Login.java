package Rest_Assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
public class Login {
	@Test
	public void LoginApi() {
	Map<String,String> data=new HashMap();
	data.put("emailId", "smartgig");
	data.put("password", "asdf1235");
	
	Response res=RestAssured.given()
	 .contentType(ContentType.URLENC)
	 .formParams(data)
	
	.when()
	 .post("http://52.172.24.161:801/api/Account/GetToken");
	EndPoints.token=res.getBody().asString();
	 System.out.println(EndPoints.token);
	Headers hd=res.getHeaders();
	for(Header a:hd) {
		System.out.println(a.getName()+"-->"+a.getValue());
	}
	Map<String,String> z=res.getCookies();
	for(String s:z.keySet()) {
		
	    System.out.println(s+"-->"+res.getCookie(s));
	}
	 
	}
	

}

package API_DEMO;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class psotdemo1 {

	public static void main(String[] args) {
		
		
		RequestSpecification req =  RestAssured.given();
		req.header("Content_Type","application/json");
		
		JSONObject hello = new JSONObject();
		
		hello.put("id",29);
		hello.put("title","Ayush");
		hello.put("author","ayush_server");
		
		req.body(hello.toJSONString());
		
		req.delete("http://localhost:3000/posts/5");
	

	}

}

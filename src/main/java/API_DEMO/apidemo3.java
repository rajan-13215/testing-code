package API_DEMO;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class apidemo3 {

	public static void main(String[] args) {
		
		RequestSpecification req =  RestAssured.given();
		req.header("Content-Type","application/json");
		
		JSONObject json = new JSONObject();
		
		json.put("id", 100);
		json.put("title", "herro-herro");
		json.put("author", "number-1");
		
		req.body(json.toJSONString());
		req.put("http://localhost:3000/posts/100");
		System.out.println("updated");

	}

}

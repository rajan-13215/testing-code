package API_DEMO;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postdemo {

	public static void main(String[] args) {
		
		
	RequestSpecification req = RestAssured.given();
	
	req.header("Content-Type","application/json" );
	
	JSONObject json = new JSONObject();
	
	json.put("id", 21);
	json.put("title", "Ayush");
	json.put("author", "ayush_server");
	
	req.body(json.toJSONString());
	
	Response resp = req.post("http://localhost:3000/posts");
	int code = resp.getStatusCode();
	System.out.println(code);
	

	}

}

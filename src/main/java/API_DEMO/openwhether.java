package API_DEMO;

import org.apache.http.util.Asserts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class openwhether {

	public static void main(String[] args) {
		
		
		Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
        int code = resp.getStatusCode();
        System.out.println("status code is "+code);
        
        String fullresponce = resp.asString();
        System.out.println(fullresponce);
        
   
	}

}

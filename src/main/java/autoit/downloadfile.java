package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class downloadfile {
	
	
	@Test
	public void filedownload() throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/SOFTWARE%20QA/Desktop/upload_movie.htm");
		driver.findElement(By.xpath("//input[@name='upload_movie']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\SOFTWARE QA\\Desktop\\autoit_script\\upload_movies.exe");
		
	}

}

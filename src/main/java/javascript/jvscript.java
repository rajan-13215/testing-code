package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jvscript {
	
	@Test
	public void javascripts() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.faridagupta.com/");
			driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("prompt('Enter User Name')");
			
	}

}

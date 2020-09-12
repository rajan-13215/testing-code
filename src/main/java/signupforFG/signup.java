package signupforFG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signup {
	
	
	@Test
	public void signupfg() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://faridagupta.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		
		
		
	}

}

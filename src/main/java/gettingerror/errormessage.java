package gettingerror;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

   @Test
   public class errormessage {

	
	public void errors() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.faridagupta.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		
		driver.findElement(By.id("not-logged-in-icon")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("rajan@faridagupta.com");
		driver.findElement(By.xpath("//input[@id='register-btn']")).click();
		String error_message = driver.findElement(By.xpath("//ul[@id='registered-email-invalid_reg']//li[@class='error-msg']")).getText();
	    System.out.println(error_message);
	    
	    String expected_message = "This Email ID is already registered with an existing account.";
		Assert.assertEquals(error_message, expected_message);
		System.out.println("test passes sucessfully");
		
		
	}
}

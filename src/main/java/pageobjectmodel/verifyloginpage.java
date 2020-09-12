package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyloginpage {
	
	
	@Test
	public void loggedinFG() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://faridagupta.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		
		loginpage login_process = new loginpage(driver);
		
		login_process.enterusername();
		login_process.enterpassword();
		login_process.click_on_login();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='customer_account_link']//span//*[local-name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).isDisplayed());
		System.out.println("test passed");
	
	}

}

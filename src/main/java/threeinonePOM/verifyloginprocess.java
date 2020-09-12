package threeinonePOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyloginprocess {
	
	@Test
	public void loginpagemodule() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://faridagupta.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		
		FGloggedin fg = new FGloggedin(driver);
		fg.allfields("rajan@faridagupta.com", "Rajan@123");
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='customer_account_link']//span//*[local-name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).isDisplayed());
		System.out.println("test passed");
		
	}

}

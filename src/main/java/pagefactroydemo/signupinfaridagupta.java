package pagefactroydemo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class signupinfaridagupta {

	@Test
	public void faridaguptasignup() {
		
		Logger logger = new LogManager().getLogger(signupinfaridagupta.class);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		
		driver.get("https://faridagupta.com/");
		logger.info("Browser Started");
		logger.error("this is error message");
		logger.fatal("this is fatal error message");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		
		
		
		signuppage signup = PageFactory.initElements(driver, signuppage.class);
		signup.signupinFG("8791161110", "automation@running6.com", "Rajan@123");
		
		WebElement loggedinicon = driver.findElement(By.xpath("//a[@id='customer_account_link']//span//*[local-name()='svg']"));
		
		Assert.assertTrue(loggedinicon.isDisplayed());
		System.out.println("test passed");
		
		
	
	}
}

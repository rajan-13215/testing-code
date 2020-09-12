package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FaridaGupta {
	
	
	WebDriver driver;
	
	@BeforeClass
	public void startbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("==========Browser Started==============");
		
	}
	
	@Test
	public void FG() {
		
		driver.get("https://www.faridagupta.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='logo']//img")).isDisplayed());
		
	}
	
	@Test(dependsOnMethods="FG")
	public void login() {
		
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		driver.findElement(By.name("login[username]")).sendKeys("rajan@faridagupta.com");
		driver.findElement(By.xpath("//input[@id='pass88']")).sendKeys("Rajan@123");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		driver.findElement(By.xpath("//a[@id='customer_account_link']//span//*[local-name()='svg']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'Welcome to your FG account. Nothing matters more t')]")).isDisplayed());
	}
	
	@Test(dependsOnMethods="login")
	public void logout() throws Exception {
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(7000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='logo']//img")).isDisplayed());
	}
	
	@AfterClass
    public void browserclosed() {
    	
    	driver.quit();
    	System.out.println("========Browser Closed===========");
    }
}

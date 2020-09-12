package crossbrowser1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross {

	
	WebDriver driver;
	
	@Test
	@Parameters("platforms")
	public void browsertesting(String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if (browser.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\AWS\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
        
		driver.get("https://faridagupta.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		driver.findElement(By.name("login[username]")).sendKeys("rajan@faridagupta.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rajan@123");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		driver.quit();

	}

}

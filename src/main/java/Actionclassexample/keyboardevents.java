package Actionclassexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboardevents {

	@Test
	public void keyboard() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		driver.get("https://www.faridagupta.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		
		driver.findElement(By.name("login[username]")).sendKeys("rajan@faridagupta.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rajan@123");
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
	}
}

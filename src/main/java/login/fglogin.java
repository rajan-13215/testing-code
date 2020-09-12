package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fglogin {
	
	
	@Test(priority=2,description="QA verified login functionity")
	public void login() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://faridagupta.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		driver.findElement(By.name("login[username]")).sendKeys("rajan@faridagupta.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rajan@123");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		System.out.println("logged in sucessfully");
	}
	
	
	
	@Test(priority=1,description="verified page title")
	public void pagetitle() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.faridagupta.com/");
		driver.manage().window().maximize();
		
		String pagetitle = driver.getTitle();
		System.out.println("page title is "+pagetitle);
		
		if (pagetitle.contains("Clothing")) {
			
			System.out.println("Tile is showing correctly");
			
		} else {
			
			System.out.println("test failed");

		}

	}
	
	}


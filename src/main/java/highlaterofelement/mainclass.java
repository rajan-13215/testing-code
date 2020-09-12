package highlaterofelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainclass {

	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://faridagupta.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		
//		WebElement username = driver.findElement(By.name("login[username]"));
//		hightlighterofelemnts.highlighterofwebelements(driver, username);
//		username.sendKeys("rajan@faridagupta.com");
//	
//		WebElement passwrod = driver.findElement(By.xpath("//input[@id='pass']"));
//		hightlighterofelemnts.highlighterofwebelements(driver, passwrod);
//		passwrod.sendKeys("Rajan@123");
//		
//		WebElement logged_in = driver.findElement(By.xpath("//button[@id='send2']"));
//		hightlighterofelemnts.highlighterofwebelements(driver, logged_in);
//		logged_in.click();

	}

}

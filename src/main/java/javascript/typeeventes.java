package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class typeeventes {
	
	@Test
	public void type() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.faridagupta.com/");
			driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
			driver.findElement(By.id("not-logged-in-icon")).click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
//			WebElement email = driver.findElement(By.xpath("//input[@name='login[username]']"));
			js.executeScript("arguments[0].value='rajan@faridagupta.com'",driver.findElement(By.xpath("//input[@name='login[username]']")));
			System.out.println("hello");
			WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
			js.executeScript("arguments[0].value='Rajan@123'",password);
			WebElement login = driver.findElement(By.xpath("//button[@id='send2']"));
			js.executeScript("arguments[0].click()",login);
			
			
			
			
			
			
			
	}

}

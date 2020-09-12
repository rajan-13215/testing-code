package scrollexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollview {

	
	@Test
	public void scrollintoview() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://faridagupta.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//h4[contains(text(),'Discover Farida Gupta')]"));
		System.out.println("hello");
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		System.out.println(ele.getText());
		
		
	}
}

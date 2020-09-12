package robotclassdemo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class robotclassdemo {
	
	
	@Test
	public void robotclass() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\AWS\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		Robot robot = new Robot();
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//p[contains(text(),'Latest stable version')]//a[contains(text(),'3.141.59')]")).click();
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}

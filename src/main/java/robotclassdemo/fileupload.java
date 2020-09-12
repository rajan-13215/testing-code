package robotclassdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileupload {

	@Test
	public void fileupload() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Robot robot = new Robot();
		
		driver.get("https://www.monsterindia.com/rio/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='btn line-btn fl txt-ac']")).click();
		driver.findElement(By.xpath("//label[@class='upload-file']")).click();
		
		StringSelection filname = new StringSelection("C:\\Users\\SOFTWARE QA\\Desktop\\AWS\\IEDriverServer_Win32_3.141.0\\QA_Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filname, null);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
}

package threeinonePOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FGloggedin {
	
	
	WebDriver driver;
	
	
	By userid = By.xpath("//input[@id='email']");
	By passid = By.xpath("//input[@id='pass']");
	By loginbutton = By.xpath("//button[@id='send2']");
	
	public FGloggedin(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void allfields(String Uid, String Passwordid) {
		
		driver.findElement(userid).sendKeys(Uid);
		driver.findElement(passid).sendKeys(Passwordid);
		driver.findElement(loginbutton).click();
		
	}

}

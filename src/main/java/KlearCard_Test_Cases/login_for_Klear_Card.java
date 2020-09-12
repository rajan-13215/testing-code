package KlearCard_Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


   @Test
   public class login_for_Klear_Card {
	
	
	public void verifyloginprocess()  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dev.klearcard.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='landing-button login-btn']")).click();
		
		login login = PageFactory.initElements(driver, login.class);
		
		login.logintoKlearCard("9045682529", "Rajan@123");
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Internal server error')]")).isDisplayed());
		System.out.println("Loogeed In Sucessfully");
		
		driver.findElement(By.xpath("//span[@class='simple-link open-password-reset']")).click();
		
		login.resetpassword("9045682529", "123456", "Rajan@123", "Rajan@123");
		Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Your password was successfully changed! Please log in to start the work.']")).isDisplayed());
		System.out.println("password reset sucessfully");
		
		
		
	}

}

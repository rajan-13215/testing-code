package KlearCard_Test_Cases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


   @Test
   public class sign_up_for_Klear_Card {
	
	public void verifysignupprocess() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dev.klearcard.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='landing-button secondary sign-up-btn']")).click();
		
		SignUp signup = new SignUp(driver);
		
		
		signup.Company_information("abc", "abc", "123456", "123hdhdhdZ");
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Your Details')]")).isDisplayed());
		System.out.println("1st section Company Information has been filled sucessfully");
		
		
		signup.main_details("Rajan", "Gupta", "rajan13215@gmail.com", "Rajan@123", "Rajan@123");
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'User Verification')]")).isDisplayed());
		System.out.println("2nd section Main Detail has been filled sucessfully");
		
		
		signup.user_verification("1234", "12/11/2021", "29/04/1993", "abc", "123456");
		
        WebElement dropdownvalue = driver.findElement(By.xpath("//select[@class='select2 select2-hidden-accessible']"));
		Select value = new Select(dropdownvalue);
		List<WebElement> allvalue = value.getAllSelectedOptions();
		System.out.println(allvalue.size());
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Verify your mobile number')]")).isDisplayed());
		System.out.println("3rd section User verification has been filled sucessfully");
		
		
		
		signup.mobile_verification("9045682529", "123456");
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Choose a Plan')]")).isDisplayed());
		System.out.println("4th section Mobile verification has been filled sucessfully");
		
		signup.choose_a_plan("2124521451245412", "Rajan Gupta", "11/23", "123");
		System.out.println("===========Test Completed===========");
		
		
		
	}

}

package calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calandar {
	
	
	@Test
	public void staticway() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		//driver.findElement(By.xpath("//td[contains(text(),'21')]")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='rb-calendar']//td"));
		System.out.println(dates.size());
		
		for (WebElement ele : dates) {
			
			String particulatdate = ele.getText();
			System.out.println(particulatdate);
			
			if (particulatdate.equalsIgnoreCase("28")) {
				
				ele.click();
				break;
			}
			
		}
		
	}
	

}

package calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class irctc {
	
	
	@Test
	public void bookingrail() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'12')]")).click();
		
		List<WebElement> dates= driver.findElements(By.xpath("//div[@class='ng-tns-c12-5 ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-shadow ng-trigger ng-trigger-overlayState']/table//td"));
	
            for (WebElement ele : dates) {
			
			String particulatdate = ele.getText();
			System.out.println(particulatdate);
			
			if (particulatdate.equalsIgnoreCase("19")) {
				
				ele.click();
				break;
			}
	
	}
	}
}


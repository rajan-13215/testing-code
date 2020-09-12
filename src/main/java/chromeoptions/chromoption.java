package chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class chromoption {
	
	@Test
	public void chromoption() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.faridagupta.com/");
		
		
	}
	
	
}

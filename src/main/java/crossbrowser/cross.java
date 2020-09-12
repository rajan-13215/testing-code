package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross {
	
	
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void crossbrowser(String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		
		else if (browsername.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\AWS\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		else if (browsername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\AWS\\IEDriverServer_Win32_3.141.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.faridagupta.com/");
		String actualtitle = driver.getTitle();
		
		Assert.assertTrue(actualtitle.contains("Clothing"));
		System.out.println("Title Matched");
		driver.quit();
		
		
		
		
		
		
	}

}

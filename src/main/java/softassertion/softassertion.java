package softassertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion {

	
	@Test
	public void title() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.faridagupta.com/");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		SoftAssert assertion = new SoftAssert();
		String expectedtitle = "Ddfdddfdfrida Gupta";
		assertion.assertEquals(actualtitle, expectedtitle);
		System.out.println("test passed correctly");
		assertion.assertAll();
	    
		
		
		
	}
}

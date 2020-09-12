package verifytitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifytitle {
	
	
	@Test
	public void pagetitle() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.faridagupta.com/");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle = "Designer Clothing for Women – Block Printed & Designer Ethnic Wear for Women | Farida Gupta";
		
//		Assert.assertEquals(actualtitle, expectedtitle,"please fix this issue");
		
		Assert.assertTrue(actualtitle.contains("Clothing"));
		System.out.println("title matched");
		
		
		
	}

}

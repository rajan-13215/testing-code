package API_DEMO;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class API {
    	
    	
    @Test
	public void FG() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Logger logger = new LogManager().getLogger(API.class);
		
		driver.get("https://faridagupta.com/");
		logger.info("hello");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		driver.findElement(By.name("login[username]")).sendKeys("rajan@faridagupta.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rajan@123");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		
		driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav megamenu')]//span[contains(@class,'menu-title')][contains(text(),'Clothing')]")).click();
        driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav megamenu')]//div[contains(@class,'level1')]//div[contains(@class,'dropdown-menu-inner')]//div[contains(@class,'row')]//div[contains(@class,'col-sm-12 mega-col')]//div[contains(@class,'mega-col-inner')]//ul//li[contains(@class,'')]//span[contains(@class,'menu-title')][contains(text(),'Dupattas')]")).click();	
		
		String maintab = driver.getWindowHandle();
		System.out.println("main widnow name or id is "+maintab);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Nurtaj Nuzakat Indigo Dupatta')]")).click();
		
		Set<String> bothtabs = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(bothtabs);
		
		driver.switchTo().window(tabs.get(1));
//		driver.findElement(By.xpath("//label[@class='productType'][contains(text(),'M')]")).click();
		driver.findElement(By.xpath("//div[@class='add-cart 8']//button[@class='btn button btn-cart']")).click();
		
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath("//a[contains(text(),'Nurtaj Rehmat Indigo Dupatta')]")).click();
		
		
		driver.switchTo().window(tabs.get(1));
//		driver.findElement(By.xpath("//label[contains(text(),'XXL')]")).click();
		driver.findElement(By.xpath("//div[@class='add-cart 8']//button[@class='btn button btn-cart']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]")).click();
		driver.findElement(By.xpath("//div[@class='totals col-xs-12 col-lg-12 col-md-12 col-sm-12']//button[@class='button btn-proceed-checkout btn-checkout']")).click();
		driver.findElement(By.xpath("//div[4]//label[1]")).click();
		driver.findElement(By.xpath("//input[@id='fb_p_method_cashondelivery']")).click();
		driver.findElement(By.xpath("//button[@id='payment_id']")).click();
		driver.findElement(By.xpath("//button[@id='place_order']")).click();		
		Thread.sleep(8000);
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath("//a[@class='logo']//img")).click();
	}
    

}

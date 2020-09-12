package Actionclassexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.annotations.Test;

public class draganddrop {
	
    @Test
	public void dragdrop() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		WebElement src = driver.findElement(By.xpath("//span[contains(text(),'Learning DHTMLX Suite UI')]"));
		WebElement dest = driver.findElement(By.xpath("//li[contains(text(),'Ajax in Practice')]"));
		
		Actions act = new Actions(driver);
//		act.clickAndHold(src).moveToElement(dest).release().build().perform();
		act.dragAndDrop(src, dest).perform();
		
		
		
		
		
		
		
		
	}
}

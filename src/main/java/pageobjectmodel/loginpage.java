package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
	
	By username = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	By login_button = By.xpath("//button[@id='send2']");
	
	
	public loginpage(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public void enterusername() {
		
		driver.findElement(username).sendKeys("rajan@faridagupta.com");
	}
	
	public void enterpassword() {
		
		driver.findElement(password).sendKeys("Rajan@123");
	}
	
	public void click_on_login() {
		
		driver.findElement(login_button).click();
	}

}

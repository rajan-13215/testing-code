package parameterPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class parameterloginpage {

	
	WebDriver driver;
	
	By username = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	By login_button = By.xpath("//button[@id='send2']");
	
	public parameterloginpage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	public void typeusername(String Uname) {
		
		driver.findElement(username).sendKeys(Uname);
		
	}
	
	public void typepasswrod (String pass) {
		
		driver.findElement(password).sendKeys(pass);
	}
	
	public void loggedinbutton() {
		
		driver.findElement(login_button).click();
	}
	
}

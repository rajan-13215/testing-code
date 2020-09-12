package KlearCard_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login {
	
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-phone']") WebElement mobilenumber;
	@FindBy(how=How.XPATH,using="//input[@id='login-password']") WebElement password;
	@FindBy(how=How.XPATH,using="//input[@id='password-reset-phone']") WebElement forgot_password;
	@FindBy(how=How.XPATH,using="//input[@id='password-reset-code']") WebElement forgot_password_OTP;
	@FindBy(how=How.XPATH,using="//input[@id='new-password']") WebElement new_password;
	@FindBy(how=How.XPATH,using="//input[@id='new-password-copy']") WebElement new_password_repeat;
	
	
   public login(WebDriver driver) {
		
		this.driver= driver;
	}
   
   
   public void logintoKlearCard(String number, String Password) {
	   
	 mobilenumber.sendKeys(number);
	 driver.findElement(By.xpath("//div[@class='form form-phone']//div[@class='control__indicator']")).click();
	 driver.findElement(By.xpath("//button[@class='landing-button login-phone-btn']")).click();
	 password.sendKeys(Password);
	 driver.findElement(By.xpath("//div[@class='fw jc-space-between']//div[@class='control__indicator']")).click();
	 driver.findElement(By.xpath("//button[@class='landing-button login-password-btn']")).click();
	 
	 }
   
   public void resetpassword(String forgot_passwrod_number, String password_OTP, String set_password, String set_password_repeat) {
	   
	   forgot_password.sendKeys(forgot_passwrod_number);
	   driver.findElement(By.xpath("//div[9]//button[2]")).click();
	   forgot_password_OTP.sendKeys(password_OTP);
	   driver.findElement(By.xpath("//button[contains(@class,'landing-button password-reset-submit-code')]")).click();
	   new_password.sendKeys(set_password);
	   new_password_repeat.sendKeys(set_password_repeat);
	   driver.findElement(By.xpath("//button[contains(@class,'landing-button password-reset-submit-new-password')]")).click();
	   
	   
   }
	   
   }
	
	
	
	
	



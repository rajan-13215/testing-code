package pagefactroydemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class signuppage {
	 
	
		
		WebDriver driver;
		
		@FindBy(how=How.XPATH,using="//input[@id='mobile']") WebElement mobilenumber;
		@FindBy(how=How.XPATH,using="//input[@id='email_address']") WebElement emailid;
		@FindBy(how=How.XPATH,using="//input[@id='password']") WebElement passwrod ;
		@FindBy(how=How.XPATH,using="//input[@id='register-btn']") WebElement register_button;
	
		
		public signuppage(WebDriver driver) {
			
			this.driver=driver;
			
		}
		
		public void signupinFG(String mobile, String email, String password) {
			
			mobilenumber.sendKeys(mobile);
			emailid.sendKeys(email);
			passwrod.sendKeys(password);
			register_button.click();
		}

}

package KlearCard_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
	
    WebDriver driver;
	
    By companyname = By.xpath("//input[@name='name']");
	By companyaddress = By.xpath("//input[@name='address']");
	By postalcode=  By.xpath("//input[@name='zipCode']");
	By companynumber = By.xpath("//div[contains(@class,'active')]//input[contains(@name,'number')]");
	By firstname = By.xpath("//input[@name='firstName']");
	By lastname = By.xpath("//input[@name='lastName']");
	By email = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='password']");
	By repeat_password = By.xpath("//input[@name='_password']");
	By nric = By.xpath("//label[contains(text(),'NRIC')]");
	By document_Id_number = By.xpath("//input[@name='document_id']");
	By expiration_date = By.xpath("//body//div[3]//div[3]//input[1]");
	By date_of_birth = By.xpath("//div[3]//div[4]//input[1]");
	By residential_address = By.xpath("//input[@name='residential_address']");
	By postal_code = By.xpath("//input[@name='residential_zipCode']");
	By number = By.xpath("//input[@name='phoneNumber']");
	By OTP = By.xpath("//input[@name='verificationCode']");
	By Card_number = By.xpath("//input[@placeholder='1234 5678 9101 1213']");
	By Name_on_card = By.xpath("//input[@name='name-on-card']");
	By Card_date = By.xpath("//input[@placeholder='MM/YY']");
	By CVV = By.xpath("//input[@name='cvc']");
	
	
	public SignUp(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public void Company_information(String company_name,String company_address,String zipcode,String company_number) {
		
		driver.findElement(companyname).sendKeys(company_name);
		driver.findElement(companyaddress).sendKeys(company_address);
		driver.findElement(postalcode).sendKeys(zipcode);
		driver.findElement(companynumber).sendKeys(company_number);
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
	}
	
	public void main_details(String fname, String Lname, String Email, String Password, String RepeatPassword) {
	
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(Lname);
		driver.findElement(email).sendKeys(Email);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(repeat_password).sendKeys(RepeatPassword);
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
	}
	
	public void user_verification(String id, String exp_date, String birth_date, String residentialAddress, String code) {
		
		driver.findElement(document_Id_number).sendKeys(id);
		driver.findElement(expiration_date).sendKeys(exp_date);
		driver.findElement(date_of_birth).sendKeys(birth_date);
		driver.findElement(residential_address).sendKeys(residentialAddress);
		driver.findElement(postal_code).sendKeys(code);
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
	}
	
	public void mobile_verification(String phone_number, String recievedOTP) {
		
		driver.findElement(number).sendKeys(phone_number);
		driver.findElement(By.xpath("//div[@class='steps-wrapper']")).click();
		driver.findElement(OTP).sendKeys(recievedOTP);
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
		
	}
	
	public void choose_a_plan(String cardnumber, String nameoncard, String date, String CVV_number) {
		
		driver.findElement(By.xpath("//div[@id='yearly']//div[@id='premium']")).click();
		driver.findElement(Card_number).sendKeys(cardnumber);
		driver.findElement(Name_on_card).sendKeys(nameoncard);
		driver.findElement(Card_date).sendKeys(date);
		driver.findElement(CVV).sendKeys(CVV_number);
		driver.findElement(By.xpath("//button[@class='btn primary next']")).click();
		
		
	}
			
		
	}

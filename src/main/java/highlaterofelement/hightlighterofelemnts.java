package highlaterofelement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hightlighterofelemnts {

	public static void highlighterofwebelements(WebDriver driver, WebElement ele ) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",ele);
	
	}

}

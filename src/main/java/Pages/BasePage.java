package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	
	WebDriver driver;
	
	BasePage(WebDriver driver){
		this.driver=driver;
	}
	
	void Sendkeys(By locator, String Text) {
		
		driver.findElement(locator).sendKeys(Text);
	}
	
	void Click(By locator) {
		driver.findElement(locator).click();
	}
	
	void Refresh() {
		driver.navigate().refresh();
	}
	
	void AlertOK() {
		driver.switchTo().alert().accept();
	}
	
	void AlertCancel() {
		driver.switchTo().alert().dismiss();
	}
	
	
	
	
	
	
}

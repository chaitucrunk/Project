package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditCustomerPage {
	
	WebDriver driver;
	
	public EditCustomerPage(WebDriver driver) {
		this.driver= driver;
		
	}
	

	By CustID= By.xpath("/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input");
	By Submit= By.xpath("/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]");	


public void New_Customer_Details() {
	
	driver.findElement(CustID).sendKeys("");
	driver.findElement(Submit).click();
}


}

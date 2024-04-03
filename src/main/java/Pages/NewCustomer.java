package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomer extends BasePage{

	WebDriver driver;
	
	public NewCustomer(WebDriver driver) {
		super(driver);
		this.driver= driver;
	}
	
	By NCust=    By.xpath("/html/body/div[3]/div/ul/li[2]/a");
	By CName=    By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input");
	By Gender=   By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
	By DOB=      By.xpath("//*[@id=\"dob\"]");
	By City=     By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input");
	By State=    By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input");
	By Pin=      By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input");
	By MNumb=    By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input");
	By Email=    By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input");
	By Pword=    By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input");
	By Submit=   By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]");
	
	
	
	public void New_Customer_Details() throws InterruptedException {
		
		Click(NCust);
		Refresh();
		Click(NCust);
		
		Sendkeys(CName,"Kanna");
		Thread.sleep(2000);
		Click(Gender);
		Sendkeys(DOB,"01-01-1990");
		Sendkeys(City,"Hyderabad");
		Thread.sleep(2000);
		Sendkeys(State,"Telangana");
		Sendkeys(Pin,"511001");
		Sendkeys(MNumb,"9876543210");
		Thread.sleep(2000);
		Sendkeys(Email,"kanna@gmail.com");
		Sendkeys(Pword,"kanna123");
		Thread.sleep(2000);
		Click(Submit);
	}

	
}

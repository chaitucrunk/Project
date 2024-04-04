package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPgae extends BasePage{
	
	WebDriver driver;
	
	public loginPgae(WebDriver driver) {
		super(driver);   //to invoke the parent class constructor
		this.driver=driver;
	}
	
	//Locators
	By UName= By.name("uid");
	By Pword= By.name("password");
	By Submit= By.name("btnLogin");
	
	
	//Actions and methods
	
	public void Login_Details() {
		
		Sendkeys(UName,"mngr563127");
		Sendkeys(Pword,"jebyzun");
		Click(Submit);
		
	}
	
	

}

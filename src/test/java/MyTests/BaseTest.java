package MyTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.loginPgae;

public class BaseTest {
	
	WebDriver driver;
	
	loginPgae LP;
	
	@BeforeTest
	void Setup() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/v4/");
		LP= new loginPgae(driver);
	}
	
	
	@AfterTest
	void Closeapp() {
		driver.close();
	}
	
	
	
	
	
	
}

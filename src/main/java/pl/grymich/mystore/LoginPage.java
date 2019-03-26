package pl.grymich.mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver; 
	
	By userEmail = By.id("email");
	By userPassword = By.id("passwd");
	By submitBtn = By.id("SubmitLogin");

	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserEmail (String userAndrzejName) {
		driver.findElement(userEmail).sendKeys(userAndrzejName);
	}
}
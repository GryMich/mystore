package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.grymich.mystore.Init;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(className="login")
	WebElement signInBtn;
	
		
	public HomePage () {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	public void goToLoginPage () {
	signInBtn.click();
	
	}
}

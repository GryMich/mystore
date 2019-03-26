package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.grymich.mystore.Init;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id = "email")
	WebElement emailSIField;

	@FindBy (id = "passwd")
	WebElement passwdField;
	
	@FindBy (id = "SubmitLogin")
	WebElement loginBtn;
	
	@FindBy (id = "emailCreate")
	WebElement emailCField;
	
	@FindBy (id = "SubmitCreate")
	WebElement submitBtn;

	 

	public LoginPage () {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void loginUser(String login, String pass) {
		emailSIField.sendKeys(login);
		passwdField.sendKeys(pass);
		loginBtn.click();
	}
}
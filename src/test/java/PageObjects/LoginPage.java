package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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
	
	@FindBy (id = "email_create")
	WebElement emailCField;
	
	@FindBy (id = "SubmitCreate")
	WebElement submitBtn;

	@FindBy (css = "(\"#center_column > div.alert.alert-danger > ol > li\").getText())")
	WebElement alertMessaqe;

	public LoginPage () {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void loginUser(String email, String pass) {
		emailSIField.sendKeys(email);
		passwdField.sendKeys(pass);
		loginBtn.click();
	}
	
	
    public void RegistrationAlert() {
    	
    	String expectedAlertMessage = "Authentication failed.";
    	
        String alertMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
    	if (alertMessage.contentEquals(expectedAlertMessage)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    
        System.out.println(alertMessage);	
    }
    
}
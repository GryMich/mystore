package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsCollectionContaining;
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

	@FindBy(css = "#center_column > .alert li")
    private List<WebElement> alertMessage;

	public LoginPage () {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public void loginUser(String email, String pass) {
		emailSIField.sendKeys(email);
		passwdField.sendKeys(pass);
		loginBtn.click();
	}
	public void passwordAlert() {
		
		String invalidPasswordAlert = "Invalid password.";
		Assert.assertThat(getAlertContent(), IsCollectionContaining.hasItem(invalidPasswordAlert));
	}
	
	public void emailAlert() {
		
		String emailRequiredAlert = "An email address required.";
		Assert.assertThat(getAlertContent(), IsCollectionContaining.hasItem(emailRequiredAlert));
	}
	
    public void registrationAlert() {
    	
    	String authenticationAlert = "Authentication failed.";
    	Assert.assertThat(getAlertContent(), IsCollectionContaining.hasItem(authenticationAlert));
    }
    private List<String> getAlertContent() {
        List<String> alertMessages = new ArrayList<String>();

        for(WebElement message : alertMessage) {
            alertMessages.add(message.getText());
        }
        System.out.println(alertMessages);
        return alertMessages;
    }
}
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.grymich.mystore.Init;


public class ProfilePage {

	WebDriver driver;
	
	@FindBy(css = "#center_column > h1")
	WebElement ProfileTitle;

	public ProfilePage () {
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);
	}
public void profilePageVeryfication() {
	
	String expectedTitle = "MY ACCOUNT";
	
    String actualTitle = driver.findElement(By.cssSelector("#center_column > h1")).getText();
	if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }

    System.out.println(actualTitle);	
}
}
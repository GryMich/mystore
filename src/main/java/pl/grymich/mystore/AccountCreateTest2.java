package pl.grymich.mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreateTest2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MICHAŁ\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWaitVar = new WebDriverWait (driver, 10);
		
		driver.get("http://automationpractice.com/");
	    driver.findElement(By.className("login")).click();
	    driver.findElement(By.id("email_create")).sendKeys("andrzej@test.com");
	    driver.findElement(By.id("SubmitCreate")).click();
	    
	    myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("create_account_error")));
		driver.findElement(By.id("create_account_error"));
		
		String expectedAlertMessage = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
        String alertMessage = driver.findElement(By.cssSelector("#create_account_error > ol > li")).getText();
        
        if (alertMessage.contentEquals(expectedAlertMessage)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    
        System.out.println(alertMessage);	
        
        driver.close();
	}
}

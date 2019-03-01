package pl.grymich.mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LoginTest5 {

    public static void main(String[] args) {
  
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\MICHAŁ\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWaitVar = new WebDriverWait (driver, 10);
				
		driver.get("http://automationpractice.com/");
	    driver.findElement(By.className("login")).click();
	   	driver.findElement(By.name("email")).sendKeys("0@0.pl");
		driver.findElement(By.name("passwd")).sendKeys("qwer");
		driver.findElement(By.name("SubmitLogin")).click();
		
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#center_column > div.alert.alert-danger")));
		driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger"));
				
		String expectedAlertMessage = "Authentication failed.";
        String alertMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger > ol > li")).getText();
        
        if (alertMessage.contentEquals(expectedAlertMessage)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    
        System.out.println(alertMessage);	
	    
		/*driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")).click();
		driver.findElement(By.linkText("Logout")).click();
		*/
	    driver.close();
	       
	    }
    }

package pl.grymich.mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static void main(String[] args) {
  
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\MICHAŁ\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWaitVar = new WebDriverWait (driver, 10);
		
		String actualURL ="";
		String expectedURL = "";
		
		driver.get("http://automationpractice.com/");
	    driver.findElement(By.className("login")).click();
	   	driver.findElement(By.name("email")).sendKeys("awd@wd.pl");
		driver.findElement(By.name("passwd")).sendKeys("qwerty");
		driver.findElement(By.name("SubmitLogin")).click();
		
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.className("account")));
		driver.findElement(By.className("account"));
				
		expectedURL = ("http://automationpractice.com/index.php?controller=my-account");
		actualURL = driver.getCurrentUrl();
		
		 if (actualURL.contentEquals(expectedURL)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	    
		/*driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")).click();
		driver.findElement(By.linkText("Logout")).click();
		*/
	    driver.close();
	       
	    }
    }

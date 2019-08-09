package pl.grymich.mystore;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class trening {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\MICHAŁ\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait myWaitVar = new WebDriverWait (driver, 10);
	
	driver.get("http://automationpractice.com/");
	driver.findElement(By.id("homepage-slider")).click();
	myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("navbar-collapse-menu")));
	
	Actions builder = new Actions(driver);
	Action goback = builder
			.keyDown(Keys.BACK_SPACE)
			.keyUp(Keys.BACK_SPACE)
			.build();
	
	goback.perform();
			
		
	
	
	
	}
}
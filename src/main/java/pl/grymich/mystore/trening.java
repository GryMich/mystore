package pl.grymich.mystore;

import org.openqa.selenium.By;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
public class trening {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\MICHAŁ\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait myWaitVar = new WebDriverWait (driver, 10);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	driver.get("http://automationpractice.com/");
	driver.findElement(By.id("homepage-slider")).click();
	myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("navbar-collapse-menu")));
	
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
	
	
	
	}
}
package pl.grymich.mystore;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {

	static WebDriver driver; 
	
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MICHAŁ\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		
		if(driver==null) {
	    	//driver = new ChromeDriver(); 
	    	driver = new RemoteWebDriver(cap);
		driver.get("http://automationpractice.com/");
		return driver;
	} else {
		return driver;
	}

    }
	
	public static void endTest() {
		driver.quit();
		driver = null;
	}

	public static void sleep (int seconds) {
		try {
			Thread.sleep(1000);
	} 		catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	}
}
}

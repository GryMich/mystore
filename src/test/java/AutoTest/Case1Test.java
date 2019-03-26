package AutoTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import pl.grymich.mystore.Init;


public class Case1Test {
	
	WebDriver driver = null;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	
	@Test
	public void toLoginPage () {
		HomePage homePage = new HomePage ();
		homePage.goToLoginPage();
	}	
	
	@After
	public void close() {
		Init.endTest();
	}
}


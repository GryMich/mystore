package AutoTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import pl.grymich.mystore.Init;



public class Case1Test {
	
	WebDriver driver = null;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	
	@Test
	public void loginVar1 () {
		HomePage homePage = new HomePage ();
		homePage.goToLoginPage();
		LoginPage loginPage = new LoginPage ();
		loginPage.loginUser("andrzej@test.com", "qwerty");
	}
	{
		Init.sleep(5000);
		
	}	
	
	@After
	public void close() {
		Init.endTest();
	}
}


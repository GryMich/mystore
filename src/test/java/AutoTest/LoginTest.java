package AutoTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.ProfilePage;
import pl.grymich.mystore.Init;



public class LoginTest {
	
	WebDriver driver = null;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	
	@Test
	public void SuccessFullLoginIntoAccount () {
		HomePage homePage = new HomePage ();
		homePage.goToLoginPage();
		LoginPage loginPage = new LoginPage ();
		loginPage.loginUser("andrzej@test.com", "qwerty");
		ProfilePage profilePage = new ProfilePage();
		profilePage.ProfilePageVeryfication();
	}

	@Test
	public void LoginIntoAccountUsingWrongPassword () {
		HomePage homePage = new HomePage ();
		homePage.goToLoginPage();
		LoginPage loginPage = new LoginPage ();
		loginPage.loginUser("andrzej@test.com", "qwert");
		loginPage.RegistrationAlert();
	}
	@After
	public void close() {
		Init.endTest();
	}
}


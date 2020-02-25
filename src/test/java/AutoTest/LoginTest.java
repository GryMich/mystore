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
		driver.manage().window().maximize();
	}
	@Test //TC1.6
	public void loginIntoAccountWithoutFillingFields () {
		HomePage homePage = new HomePage ();
		homePage.goToLoginPage();
		LoginPage loginPage = new LoginPage ();
		loginPage.loginUser("", "");
		loginPage.emailAlert();
	}
	
	@Test //TC1.5
	public void loginIntoAccountUsingTooShortPassword () {
		HomePage homePage = new HomePage ();
		homePage.goToLoginPage();
		LoginPage loginPage = new LoginPage ();
		loginPage.loginUser("andrze@test.com", "qwert");
		loginPage.registrationAlert();
	}
	
	@Test //TC1.4
	public void loginIntoAccountUsingWrongEmailAndPassword () {
		HomePage homePage = new HomePage ();
		homePage.goToLoginPage();
		LoginPage loginPage = new LoginPage ();
		loginPage.loginUser("andrze@test.com", "qwert");
		loginPage.registrationAlert();
	}
	@Test //TC1.3
	public void loginIntoAccountUsingWrongEmail () {
		HomePage homePage = new HomePage ();
		homePage.goToLoginPage();
		LoginPage loginPage = new LoginPage ();
		loginPage.loginUser("andrze@test.com", "qwerty");
		loginPage.registrationAlert();
	}
	
		
	@Test //TC1.2
	public void loginIntoAccountUsingWrongPassword () {
		HomePage homePage = new HomePage ();
		homePage.goToLoginPage();
		LoginPage loginPage = new LoginPage ();
		loginPage.loginUser("andrzej@test.com", "qwert");
		loginPage.registrationAlert();
	}
	
	@Test //TC1.1
	public void successfulLoginIntoAccount () {
		HomePage homePage = new HomePage ();
		homePage.goToLoginPage();
		LoginPage loginPage = new LoginPage ();
		loginPage.loginUser("andrzej@test.com", "qwerty");
		ProfilePage profilePage = new ProfilePage();
		profilePage.profilePageVeryfication();
	}
	
	@After
	public void close() {
		Init.endTest();
	}
}


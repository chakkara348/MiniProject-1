package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_002_Login_with_Invalid_credentials_as_username_as_empty extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Login with Username as empty";
		TestDescription="Verify the login page with username as empty";
		testCategory="Invalid";
		testAuthor="chakkaravarthi";
	}
	
	
	@Test
	public void LoginWithEmptyCredential() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.enterLoginUsername("")
		.enterLoginPassword(props.getProperty("Password"))
		.clickingLoginBtn()
		.loginValidation("invalid", "Please fill out Username and Password.");
	}

}

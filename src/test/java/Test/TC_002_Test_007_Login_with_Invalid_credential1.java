package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_002_Test_007_Login_with_Invalid_credential1 extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Login with username and password as empty";
		TestDescription="Verify the login with username and password as empty";
		testCategory="valid";
		testAuthor="chakkaravarthi";
	}
	
	
	@Test
	public void LoginWithEmptyCredential() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.enterLoginUsername("")
		.enterLoginPassword("")
		.clickingLoginBtn()
		.loginValidation("invalid", "Please fill out Username and Password.");
	}

}

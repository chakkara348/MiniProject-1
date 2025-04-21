package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_002_Test_005_Check_login_with_password_as_empty extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Login with Password as empty";
		TestDescription="Verify the login page with password as empty";
		testCategory="Invalid";
		testAuthor="chakkaravarthi";
	}
	
	
	@Test
	public void LoginWithEmptyCredential() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.enterLoginUsername(props.getProperty("Username"))
		.enterLoginPassword("")
		.clickingLoginBtn()
		.loginValidation("invalid", "Please fill out Username and Password.");
	}

}

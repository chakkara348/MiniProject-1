package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_002_Test_003_Login_with_Invalid_credentials extends DemoBlazeWebPage {

	@BeforeTest
	public void setUp() {
		sheetName = "Login_Invalid_credentials";
		TestName = "Login with not sign up user details";
		TestDescription = "Verify the login with not sign up user details";
		testCategory = "Invalid";
		testAuthor = "chakkaravarthi";
	}

	@Test(dataProvider = "readData")
	public void LoginWithInValidcredentials(String username, String password, String testType, String expectedMessage)
			throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.loginClick().enterLoginUsername(username).enterLoginPassword(password).clickingLoginBtn()
				.loginValidation(testType, expectedMessage);
	}
}

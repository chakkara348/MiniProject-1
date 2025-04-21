package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_002_Test_006_Login_with_valid_Credentials extends DemoBlazeWebPage {

	@BeforeTest
	public void setUp() {
		sheetName = "Login_valid_credentials";
		TestName = "Login with valid credentials";
		TestDescription = "Verify the login with valid username and password";
		testCategory = "valid";
		testAuthor = "chakkaravarthi";
	}

	@Test(dataProvider = "readData")
	public void LoginWithValidCredentials(String username, String password, String testType, String expecetdMessage)
			throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.loginClick().enterLoginUsername(username).enterLoginPassword(password).clickingLoginBtn()
				.loginValidation(testType, expecetdMessage);
		;
	}

}

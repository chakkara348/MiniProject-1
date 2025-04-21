package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_002_Test_001_Verify_Login_Option extends DemoBlazeWebPage {

	@BeforeTest
	public void setUp() {
		TestName = "Checking Log in option";
		TestDescription = "Verify the log in options is displayed";
		testCategory = "valid";
		testAuthor = "chakkaravarthi";
	}

	@Test
	public void checkingLoginMenuIsAvailable() {
		HomePage homePage = new HomePage(driver);
		homePage.checkLoginButton();
	}

}

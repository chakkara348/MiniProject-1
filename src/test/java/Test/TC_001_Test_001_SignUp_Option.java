package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_001_Test_001_SignUp_Option extends DemoBlazeWebPage {

	@BeforeTest
	public void setUp() {
		TestName = "Checking Sign up option";
		TestDescription = "Verify the sign up option is displayed";
		testCategory = "valid";
		testAuthor = "chakkaravarthi";
	}

	@Test
	public void checkingSignUpMenuAvailability() {

		HomePage homePage = new HomePage(driver);
		homePage.checkSignUpButton();
	}

}

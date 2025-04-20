package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_001_SignUpTest_Valid_Scenario extends DemoBlazeWebPage {

	@BeforeTest
	public void setUp() {
		sheetName = "SignUp";
		TestDescription = "Logout from the webpage";
		testCategory = "valid";
		testAuthor = "chakkaravarthi";
	}

	@Test(dataProvider = "readData")
	public void signUpTest(String username, String password, String testType, String expectedResult)
			throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.signUpClick().enterUsername(username).enterPassword(password).clickSignUpBtn()
				.signUpValidation(testType, expectedResult);
		;

	}

}

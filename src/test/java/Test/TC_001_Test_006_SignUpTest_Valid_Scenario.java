package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_001_Test_006_SignUpTest_Valid_Scenario extends DemoBlazeWebPage {

	@BeforeTest
	public void setUp() {
		sheetName = "SignUp";
		TestName="Sign up with valid details";
		TestDescription = "Verify the sign up valid details";
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

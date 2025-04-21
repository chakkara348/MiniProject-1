package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_001_Test_002_SignUp_Heading extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Checking Sign Up pop up heading";
		TestDescription="Verify the sign up text is displayed on the sign up pop";
		testCategory="valid";
		testAuthor="chakkaravarthi";
	}
	
	@Test
	public void checkingSignUpPopUpHeading() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.signUpClick()
		.checkSignUpHeading("Sign up");
	}

}

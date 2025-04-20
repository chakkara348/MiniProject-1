package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_001_Test_SignUp_Heading extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Logout";
		TestDescription="Logout from the webpage";
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

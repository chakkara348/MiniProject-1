package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_001_Test_004_SignUpTest_Invalid_Scenario2 extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Sign Up with username as empty";
		TestDescription="Verify the sign up with username as empty";
		testCategory="Invalid";
		testAuthor="chakkaravarthi";
	}
	

	@Test
	public void signUpTestInvalid() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.signUpClick()
		.enterUsername("")
		.enterPassword(props.getProperty("Password"))
		.clickSignUpBtn()
		.signUpValidation("invalid", "Please fill out Username and Password.");
	}

}

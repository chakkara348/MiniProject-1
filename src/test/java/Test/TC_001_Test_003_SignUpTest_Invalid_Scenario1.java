package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_001_Test_003_SignUpTest_Invalid_Scenario1 extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Sign Up with username and password as empty";
		TestDescription="Verify the sign up with username and password as empty";
		testCategory="Invalid";
		testAuthor="chakkaravarthi";
	}
	
	@Test
	public void signUpTestInvalid() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.signUpClick()
		.enterUsername("")
		.enterPassword("")
		.clickSignUpBtn()
		.signUpValidation("invalid", "Please fill out Username and Password.");
	}	 

}

package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_001_Test_005_SignUpTest_Invalid_Scenario3 extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Sign Up with Password as empty";
		TestDescription="Verify the sign up with password as empty";
		testCategory="valid";
		testAuthor="chakkaravarthi";
	}
	
	@Test
	public void signUpTestInvalid() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.signUpClick()
		.enterUsername(props.getProperty("Username"))
		.enterPassword("")
		.clickSignUpBtn()
		.signUpValidation("invalid", "Please fill out Username and Password.");
	}

}

package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_003_SignUpTest_Invalid_Scenario2 extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Logout";
		TestDescription="Logout from the webpage";
		testCategory="valid";
		testAuthor="chakkaravarthi";
	}
	

	@Test
	public void signUpTestInvalid() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.signUpClick()
		.enterUsername("")
		.enterPassword("ferere")
		.clickSignUpBtn()
		.signUpValidation("invalid", "Please fill out Username and Password.");
	}

}

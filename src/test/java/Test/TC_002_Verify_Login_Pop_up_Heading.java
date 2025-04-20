package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_002_Verify_Login_Pop_up_Heading extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Logout";
		TestDescription="Logout from the webpage";
		testCategory="valid";
		testAuthor="chakkaravarthi";
	}
	
	@Test
	public void checkingLoginPopUpHeading() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.checkLoginHeading("Log in");
	}

}

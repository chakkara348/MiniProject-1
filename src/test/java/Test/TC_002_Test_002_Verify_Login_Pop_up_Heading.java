package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_002_Test_002_Verify_Login_Pop_up_Heading extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName = "Checking Log in pop up heading";
		TestDescription = "Verify the log in text is displayed on the login pop up";
		testCategory="valid";
		testAuthor="chakkaravarthi";
	}
	
	@Test
	public void checkingLoginPopUpHeading() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.checkLoginHeading();
	}

}

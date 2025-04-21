package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_007_Test_001_Verify_logout extends DemoBlazeWebPage{
	
	@BeforeTest
	public void setUp() {
		TestName="Logout";
		TestDescription="Logout from the webpage";
		testCategory="valid";
		testAuthor="chakkaravarthi";
	}
	
	@Test
	public void checkingLogout() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.enterLoginUsername(props.getProperty("Username"))
		.enterLoginPassword(props.getProperty("Password"))
		.clickingLoginBtn();
		Thread.sleep(5000);
		homePage.checkLogoutbtn()
		.clickLogoutBtn()
		.checkingRedirectToHomePage();
	}

}

package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;


public class TC_001_Menu_Check extends DemoBlazeWebPage {
	
	
	@BeforeTest
	public void setUp() {
		TestName="Menu check";
		TestDescription="Verify the Menu options are displayed";
		testCategory="valid";
		testAuthor="chakkaravarthi";
	}
	
	
	@Test
	public void checkingMenu() {
		
		HomePage homePage = new HomePage(driver);
		homePage.checkHomeMenu()
		.checkContactMenu()
		.checkAboutMenu()
		.checkCartMenu();
	}

}

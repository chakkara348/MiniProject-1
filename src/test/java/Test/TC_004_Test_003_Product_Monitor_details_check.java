package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_004_Test_003_Product_Monitor_details_check extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Product Monitor Check";
		TestDescription="Checking the Product Monitor details";
		testCategory="Verify the product monitor details";
		testAuthor="Chakkaravarthi";
	}
	
	
	@Test
	public void checkingMonitorProductDetails() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.enterLoginUsername(props.getProperty("Username"))
		.enterLoginPassword(props.getProperty("Password"))
		.clickingLoginBtn()
		.clickMonitorCategory()
		.checkingMonitorProduct();
	}

}

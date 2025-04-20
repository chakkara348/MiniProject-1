package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_005_Product_Monitor_details_check extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		sheetName="Login_valid_credentials";
		TestName="Product Monitor Check";
		TestDescription="Checking the Product Monitor details";
		testCategory="Verify the product monitor details";
		testAuthor="Chakkaravarthi";
	}
	
	
	@Test(dataProvider = "readData")
	public void checkingMonitorProductDetails(String username, String password, String testType, String expectedResult) throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.enterLoginUsername(username)
		.enterLoginPassword(password)
		.clickingLoginBtn()
		.clickMonitorCategory()
		.checkingMonitorProduct();
	}

}

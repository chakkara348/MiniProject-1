package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_005_Product_Phone_details_check extends DemoBlazeWebPage {

	@BeforeTest
	public void setUp() {
		sheetName = "Login_valid_credentials";
		TestName = "Logout";
		TestDescription = "Logout from the webpage";
		testCategory = "valid";
		testAuthor = "chakkaravarthi";
	}

	@Test(dataProvider = "readData")
	public void checkingProductDetails(String username, String password, String testType, String expectedResult)
			throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.loginClick().enterLoginUsername(username).enterLoginPassword(password).clickingLoginBtn();
		homePage.clickPhoneCategory().checkingProduct();
	}

}

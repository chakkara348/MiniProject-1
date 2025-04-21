package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_004_Test_001_Product_Phone_details_check extends DemoBlazeWebPage {

	@BeforeTest
	public void setUp() {
		TestName = "Checking Product Phone Details";
		TestDescription = "Verify the product phone details";
		testCategory = "valid";
		testAuthor = "chakkaravarthi";
	}

	@Test
	public void checkingProductDetails()
			throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.loginClick().enterLoginUsername(props.getProperty("Username")).enterLoginPassword(props.getProperty("Password")).clickingLoginBtn();
		homePage.clickPhoneCategory().checkingProduct();
	}

}

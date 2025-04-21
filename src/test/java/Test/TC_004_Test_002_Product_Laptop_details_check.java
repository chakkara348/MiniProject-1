package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_004_Test_002_Product_Laptop_details_check extends DemoBlazeWebPage {

	@BeforeTest
	public void setUp() {
		TestName = "Checking Product Laptop Details";
		TestDescription = "Verify the product Laptop details";
		testCategory = "valid";
		testAuthor = "chakkaravarthi";

	}

	@Test
	public void checkingLaptopProductDetails()
			throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.loginClick().enterLoginUsername(props.getProperty("Username")).enterLoginPassword(props.getProperty("Password")).clickingLoginBtn()
				.clickLaptopCategory().checkingLaptop();
	}

}

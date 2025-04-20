package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_006_addingMonitorProductInCart extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Add Monitor in cart";
		TestDescription="Checking the Products added on cart";
		testCategory="adding to cart";
		testAuthor="Chakkaravarthi";
	}

	@Test
	public void addingMonitorProductInCart() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.enterLoginUsername(props.getProperty("Username"))
		.enterLoginPassword(props.getProperty("Password"))
		.clickingLoginBtn()
		.clickPhoneCategory()
		.addPhoneProductInCart()
		.clickingHome()
		.clickLaptopCategory()
		.addLaptopProductInCart()
		.clickingHome()
		.clickMonitorCategory()
		.addMonitorProductInCart();
	}
}

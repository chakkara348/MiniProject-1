package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_005_Test_001_Adding_Product_In_Cart_delete_cart_and_check_total extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="In cart";
		TestDescription="Checking the Products added on cart";
		testCategory="adding to cart";
		testAuthor="Chakkaravarthi";
	}

	@Test
	public void checkingProductAddedInCart() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.enterLoginUsername(props.getProperty("Username"))
		.enterLoginPassword(props.getProperty("Password"))
		.clickingLoginBtn()
		.clickPhoneCategory()
		.addPhoneProductInCart()
		.clickingHome();
		Thread.sleep(3000);
		homePage.clickLaptopCategory()
		.addLaptopProductInCart()
		.clickingHome();
		Thread.sleep(3000);
		homePage.clickMonitorCategory()
		.addMonitorProductInCart();
		Thread.sleep(5000);
		homePage.clickCart()
		.countNoOfProducts()
		.calculateTotalPrizeInCart()
		.deleteProductInCart()
		.calculateTotalPrizeInCart();
		Thread.sleep(3000);
		
	}

}

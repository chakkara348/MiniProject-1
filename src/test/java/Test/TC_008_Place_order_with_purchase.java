package Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;

public class TC_008_Place_order_with_purchase extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="In cart";
		TestDescription="Checking the Product Monitor added on cart";
		testCategory="adding to cart";
		testAuthor="Chakkaravarthi";
	}

	@Test
	public void PurchasingOrder() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		homePage.loginClick()
		.enterLoginUsername(props.getProperty("Username"))
		.enterLoginPassword(props.getProperty("Password"))
		.clickingLoginBtn();
		Thread.sleep(3000);
		homePage.clickMonitorCategory()
		.addMonitorProductInCart();
		homePage.clickCart()
		.placeOrder()
		.enterName(props.getProperty("PurchaseName"))
		.enterCountry(props.getProperty("PurchaseCountry"))
		.enterCity(props.getProperty("PurchaseCity"))
		.enterCreditCard(props.getProperty("PurchaseCreditCard"))
		.enterMonth(props.getProperty("PurchaseMonth"))
		.enterYear(props.getProperty("PurchaseYear"))
		.clickPurchaseBtn()
		.checkPurchaseOrder();
		Thread.sleep(3000);
		
		
	}
}

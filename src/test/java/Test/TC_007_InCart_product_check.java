package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.visio.x2012.main.PagesDocument;

import Base.DemoBlazeWebPage;
import Pages.CartPage;
import Pages.HomePage;

public class TC_007_InCart_product_check extends DemoBlazeWebPage {
	
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
		.calculateTotalPrizeInCart()
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

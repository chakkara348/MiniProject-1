package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.DemoBlazeWebPage;


public class CartPage extends DemoBlazeWebPage {
	
	public int NumberOfProducts;
	
	
	@FindBy(xpath = "//tbody[@id='tbodyid']//tr")
	WebElement productListedElement;
	
	@FindBy(xpath = "//h3[@id='totalp']")
	WebElement totalPrizeElement;
	
	@FindBy(xpath = "//button[text()='Place Order']")
	WebElement placeOrderElement;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public CartPage countNoOfProducts() {
		List cartProductsCountList = productListedElement.findElements(By.xpath("//tbody[@id='tbodyid']//tr"));
		NumberOfProducts = cartProductsCountList.size();
		if(NumberOfProducts!=0) {
			System.out.println("Products are added on the list");
		}else {
			System.out.println("Products are not added on the list");
		}
		return this;
	}
	
	public CartPage calculateTotalPrizeInCart() throws InterruptedException {
		Thread.sleep(6000);
		List cartProductsCountList = productListedElement.findElements(By.xpath("//tbody[@id='tbodyid']//tr"));
		int NumberOfProductsInCart = cartProductsCountList.size();
		int actualTotalPrizeAmount = Integer.parseInt(totalPrizeElement.getText());
		int actualPrizeAmount=0;
		for(int i=1;i<=NumberOfProductsInCart;i++) {
			String prize = driver.findElement(By.xpath("//tbody//tr["+i+"]//td[3]")).getText();
			actualPrizeAmount = actualPrizeAmount+Integer.parseInt(prize);
		}
		Assert.assertEquals(actualTotalPrizeAmount, actualPrizeAmount);
		return this;
	}
	
	public CartPage deleteProductInCart() throws InterruptedException {
		for(int i=1;i<=NumberOfProducts-1;i++) {
			driver.findElement(By.xpath("//tbody/tr["+i+"]/td[4]/a[text()='Delete']")).click();
			Thread.sleep(3000);
			
		}
		
		return this;
	}
	
	public PurchasePage placeOrder() {
		placeOrderElement.click();
		return new PurchasePage(driver);
	}
	

}

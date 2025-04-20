package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import Base.DemoBlazeWebPage;


public class PurchasePage extends DemoBlazeWebPage {
	
	@FindBy(id="name")
	WebElement purchaseNameElement;
	
	@FindBy(id="country")
	WebElement purchaseCountryElement;
	
	@FindBy(id="city")
	WebElement purchaseCityElement;
	
	@FindBy(id = "card")
	WebElement purchaseCreditCardElement;
	
	@FindBy(id="month")
	WebElement purchaseCreditCardMonthElement;
	
	@FindBy(id="year")
	WebElement purchaseCreditCardYearElement;
	
	@FindBy(xpath = "//button[text()='Purchase']")
	WebElement purchasebtnElement;
	
	@FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
	WebElement purchasedMessagElement;
	
	@FindBy(xpath = "//button[text()='OK']")
	WebElement purchasedPopUpOkElement;
	
	public PurchasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public PurchasePage enterName(String Name) {
		purchaseNameElement.sendKeys(Name);
		return this;
	}
	
	public PurchasePage enterCountry(String Country) {
		purchaseCountryElement.sendKeys(Country);
		return this;
	}
	
	public PurchasePage enterCity(String City) {
		purchaseCityElement.sendKeys(City);
		return this;
	}
	
	public PurchasePage enterCreditCard(String CreditCard) {
		purchaseCreditCardElement.sendKeys(CreditCard);
		return this;
	}
	
	public PurchasePage enterMonth(String Month) {
		purchaseCreditCardMonthElement.sendKeys(Month);
		return this;
	}
	
	public PurchasePage enterYear(String Year) {
		purchaseCreditCardYearElement.sendKeys(Year);
		return this;
	}
	
	public PurchasePage clickPurchaseBtn() {
		purchasebtnElement.click();
		return this;
		
	}
	
	public HomePage checkPurchaseOrder() {
		Assert.assertTrue(purchasedMessagElement.isDisplayed());
		purchasedPopUpOkElement.click();
		return new HomePage(driver);
	}
	
	

}

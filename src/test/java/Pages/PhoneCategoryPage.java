package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.DemoBlazeWebPage;


public class PhoneCategoryPage extends DemoBlazeWebPage {
	
	@FindBy(xpath = "//a[text()='Samsung galaxy s6']")
	WebElement product1clickElement;
	
	@FindBy(xpath = "//h2[text()='Samsung galaxy s6']")
	WebElement phone1Name;
	
	@FindBy(xpath = "//h3[text()='$360']")
	WebElement phone1Prize;
	
	@FindBy(xpath = "//p[contains(text(),'Samsung Galaxy S6')]")
	WebElement phone1Description;
	
	@FindBy(xpath = "//a[text()='Add to cart']")
	WebElement addToCartBtn;
	
	public PhoneCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public PhoneCategoryPage checkingProduct() throws InterruptedException {
		product1clickElement.click();
		Thread.sleep(3000);
		productDetailsCheck(phone1Name);
		productDetailsCheck(phone1Prize);
		productDetailsCheck(phone1Description);
		return this;
		
	}
	
	public HomePage addPhoneProductInCart() throws InterruptedException {
		product1clickElement.click();
		addToCartBtn.click();
		Thread.sleep(5000);
		alertValidation("add", "Product added.");
		return new HomePage(driver);
	}

}

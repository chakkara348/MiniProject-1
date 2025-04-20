package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.DemoBlazeWebPage;


public class LaptopCategoryPage extends DemoBlazeWebPage {
	
	@FindBy(xpath = "//a[text()='Sony vaio i5']")
	WebElement laptop1Element;
	
	@FindBy(xpath = "//h2[text()='Sony vaio i5']")
	WebElement laptopNameElement;
	
	@FindBy(xpath = "//h3[text()='$790']")
	WebElement laptopPrizeElement;
	
	@FindBy(xpath="//p[contains(text(),'VAIO')]")
	WebElement laptopdescElement;
	
	@FindBy(xpath = "//a[text()='Add to cart']")
	WebElement addToCartBtn;
	
	public LaptopCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public LaptopCategoryPage checkingLaptop() {
		laptop1Element.click();
		productDetailsCheck(laptopNameElement);
		productDetailsCheck(laptopPrizeElement);
		productDetailsCheck(laptopdescElement);
		return this;
	}
	
	public HomePage addLaptopProductInCart() throws InterruptedException {
		laptop1Element.click();
		addToCartBtn.click();
		Thread.sleep(5000);
		alertValidation("add", "Product added.");
		return new HomePage(driver);
	}
}

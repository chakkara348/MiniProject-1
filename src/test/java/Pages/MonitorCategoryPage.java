package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.DemoBlazeWebPage;


public class MonitorCategoryPage extends DemoBlazeWebPage {
	
	@FindBy(xpath = "//a[text()='Apple monitor 24']")
	WebElement monitor1Element;
	
	@FindBy(xpath = "//h2[text()='Apple monitor 24']")
	WebElement monitorNameElement;
	
	@FindBy(xpath ="//h3[text()='$400']" )
	WebElement monitorPrizeElement;
	
	@FindBy(xpath = "//p[contains(text(),'LED')]")
	WebElement monitorDescElement;
	
	@FindBy(xpath = "//a[text()='Add to cart']")
	WebElement addToCartBtn;
	
	public MonitorCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public MonitorCategoryPage checkingMonitorProduct() throws InterruptedException {
		monitor1Element.click();
		Thread.sleep(5000);
		productDetailsCheck(monitorNameElement);
		productDetailsCheck(monitorPrizeElement);
		productDetailsCheck(monitorDescElement);
		return this;
	}
	
	public HomePage addMonitorProductInCart() throws InterruptedException {
		monitor1Element.click();
		addToCartBtn.click();
		Thread.sleep(5000);
		alertValidation("add", "Product added.");
		return new HomePage(driver);
	}

}

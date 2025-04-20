package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.DemoBlazeWebPage;

public class HomePage extends DemoBlazeWebPage {

	String MenuName;

	@FindBy(xpath = "//a[text()='Sign up']")
	WebElement signup;

	@FindBy(xpath = "//a[text()='Log in']")
	WebElement login;

	@FindBy(id = "nameofuser")
	WebElement loggedInUserId;

	@FindBy(xpath = "//a[contains(text(),'PRODUCT STORE')]")
	WebElement logoElement;

	@FindBy(id = "logout2")
	WebElement logoutBtn;
	
	@FindBy(id = "nameofuser")
	WebElement loggedUser;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement homeMenuElement;

	@FindBy(xpath = "//a[text()='Contact']")
	WebElement contactMenuElement;

	@FindBy(xpath = "//a[text()='About us']")
	WebElement aboutUsMenuLElement;

	@FindBy(xpath = "//a[text()='Cart']")
	WebElement cartMenuElement;

	@FindBy(xpath = "//a[text()='Phones']")
	WebElement phonesCategoryElement;

	@FindBy(xpath = "//a[text()='Laptops']")
	WebElement laptopsCategoryElement;

	@FindBy(xpath = "//a[text()='Monitors']")
	WebElement monitorsCategoryElement;
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public HomePage checkSignUpButton() {
		optionIsDisplayedCheck(signup);
		return this;

	}

	public HomePage checkLoginButton() {
		optionIsDisplayedCheck(login);
		return this;
	}

	public SignUpPage signUpClick() {
		signup.click();
		return new SignUpPage(driver);
	}

	public LoginPage loginClick() {
		login.click();
		return new LoginPage(driver);
	}
	
	public HomePage checkLogo() {
		optionIsDisplayedCheck(logoElement);
		return this;
	}
	
	public HomePage loginValidation(String testType, String expectedUserResult) {
		if (testType.equalsIgnoreCase("Valid")) {
			String actualUserName = actualElementText(loggedUser);
			Assert.assertEquals(actualUserName, expectedUserResult);
		} else {
			alertValidation(testType, expectedUserResult);
		}
		return this;
	}
	
	public HomePage checkingRedirectToDashboard() {
		String expectedURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, driver.getCurrentUrl());
		return this;
	}
	

	public HomePage checkHomeMenu() {
		optionIsDisplayedCheck(homeMenuElement);
		return this;
	}

	public HomePage checkContactMenu() {
		optionIsDisplayedCheck(contactMenuElement);
		return this;
	}

	public HomePage checkAboutMenu() {
		optionIsDisplayedCheck(aboutUsMenuLElement);
		return this;
	}

	public HomePage checkCartMenu() {
		optionIsDisplayedCheck(cartMenuElement);
		return this;
	}

	public HomePage checkPhoneCategory() {
		optionIsDisplayedCheck(phonesCategoryElement);
		return this;
	}

	public HomePage checkLaptopCategory() {
		optionIsDisplayedCheck(laptopsCategoryElement);
		return this;
	}

	public HomePage checkMonitorCategory() {
		optionIsDisplayedCheck(monitorsCategoryElement);
		return this;
	}
	
	public HomePage clickingHome() {
		homeMenuElement.click();
		return this;
	}

	public PhoneCategoryPage clickPhoneCategory() {
		phonesCategoryElement.click();
		return new PhoneCategoryPage(driver);
	}

	public LaptopCategoryPage clickLaptopCategory() {
		laptopsCategoryElement.click();
		return new LaptopCategoryPage(driver);
	}

	public MonitorCategoryPage clickMonitorCategory() {
		monitorsCategoryElement.click();
		return new MonitorCategoryPage(driver);
	}

	public CartPage clickCart() {
		cartMenuElement.click();
		return new CartPage(driver);
	}
	
	public HomePage checkLogoutbtn() {
		optionIsDisplayedCheck(logoutBtn);
		
		return this;
	}
	
	public Logout clickLogoutBtn() {
		logoutBtn.click();
		return new Logout(driver);
	}

}

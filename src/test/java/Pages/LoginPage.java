package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.DemoBlazeWebPage;

public class LoginPage extends DemoBlazeWebPage {

	@FindBy(id = "logInModalLabel")
	WebElement loginHeading;

	@FindBy(id = "loginusername")
	WebElement loginUsernameField;

	@FindBy(id = "loginpassword")
	WebElement loginPasswordField;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginBtn;

	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage checkLoginHeading() throws InterruptedException {
		Thread.sleep(5000);
		optionIsDisplayedCheck(loginHeading);
		return this;
	}

	public LoginPage enterLoginUsername(String username) {
		loginUsernameField.sendKeys(username);
		return this;
	}

	public LoginPage enterLoginPassword(String password) throws InterruptedException {
		Thread.sleep(3000);
		loginPasswordField.sendKeys(password);
		return this;
	}

	public HomePage clickingLoginBtn() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(3000);
		return new HomePage(driver);
	}


}

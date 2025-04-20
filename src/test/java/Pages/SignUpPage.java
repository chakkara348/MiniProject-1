package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.DemoBlazeWebPage;


public class SignUpPage extends DemoBlazeWebPage {

	@FindBy(id = "signInModalLabel")
	WebElement signupHeading;

	@FindBy(id = "sign-username")
	WebElement usernameField;

	@FindBy(id = "sign-password")
	WebElement passwordField;

	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement signUpBtn;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SignUpPage checkSignUpHeading(String expectedHeading) throws InterruptedException {
		Thread.sleep(5000);
		String actualHeading = actualElementText(signupHeading);
		Assert.assertEquals(actualHeading,expectedHeading);
		return this;
	}

	public SignUpPage enterUsername(String username) {

		usernameField.sendKeys(username);
		return this;
	}

	public SignUpPage enterPassword(String password) {

		passwordField.sendKeys(password);
		return this;
	}

	public SignUpPage clickSignUpBtn() throws InterruptedException {

		signUpBtn.click();
		Thread.sleep(3000);
		return this;
	}
	
	public void signUpValidation(String testType,String expectedResult) {
		
		alertValidation(testType, expectedResult);
	}


}

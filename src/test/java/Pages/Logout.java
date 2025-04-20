package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.DemoBlazeWebPage;

public class Logout extends DemoBlazeWebPage {
	
		
	public Logout(WebDriver driver) {
		this.driver=driver;
	}
	
	public HomePage checkingRedirectToHomePage() {
		String ExpectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(ExpectedUrl, driver.getCurrentUrl());
		return new HomePage(driver);
	}

}

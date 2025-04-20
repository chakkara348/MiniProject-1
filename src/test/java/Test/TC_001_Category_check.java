package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.DemoBlazeWebPage;
import Pages.HomePage;




public class TC_001_Category_check extends DemoBlazeWebPage {
	
	@BeforeTest
	public void setUp() {
		TestName="Category Menu Check";
		TestDescription="Verify the category menu are displayed";
		testCategory="valid";
		testAuthor="chakkaravarthi";
	}
	
	@Test
	public void checingCategoryOptions() {
		
		HomePage homePage = new HomePage(driver);
		homePage.checkPhoneCategory()
		.checkLaptopCategory()
		.checkMonitorCategory();
	}

}

package Base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utils.UtilityClass;

public class DemoBlazeWebPage extends UtilityClass {

	@BeforeSuite
	public void reportInitialization() {

		ExtentSparkReporter reporter = new ExtentSparkReporter(
				"C:\\Users\\cmurugan\\eclipse-workspace\\MiniProject-1\\src\\test\\resources\\Report\\DemoBlazeTestData.html");
		reporter.config().setReportName("DemoBalze Test Data Report");

		extent = new ExtentReports();
		extent.attachReporter(reporter);

	}

	@BeforeClass
	public void testDetails() {
		extentTest = extent.createTest(TestName, TestDescription);
		extentTest.assignCategory(testCategory);
		extentTest.assignAuthor(testAuthor);
	}

	@Parameters({"browser","url"})
	@BeforeMethod
	public void launchingAndLoadingBrowser(String browser, String url) throws IOException {

		launchBrowser(browser,url);
		readPurchase();

	}

	@DataProvider
	public String[][] readData() throws IOException {
		String[][] data = readExcel(sheetName);
		return data;
	}

	
	@AfterMethod
	public void ClosingBrowser() {

		closeBrowser();
	}
	
	@AfterSuite
	public void closeReport() {
		extent.flush();
	}

}

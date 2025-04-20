package Utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class UtilityClass {
	
	public static WebDriver driver;
	public String sheetName;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	public String TestName, TestDescription,testCategory, testAuthor;
	public static Properties props;
	
	public void launchBrowser(String browser, String url) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(url);
	}

	public void closeBrowser() {
		
		driver.close();
	}
	
	public String actualElementText(WebElement element) {
		String actualNameString = element.getText();
		return actualNameString;
	}
	
	public void assertValidation(String actualText, String expectedText) {
		Assert.assertEquals(actualText, expectedText);
	}
		
	public static String[][] readExcel(String sheetName) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\cmurugan\\eclipse-workspace\\MiniProject-1\\src\\test\\resources\\Data\\UserListDataSet.xlsx");
		XSSFSheet sheet = book.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		short colunmnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][colunmnCount];
		for(int i=1; i<=rowCount;i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<colunmnCount;j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		book.close();
		return data;
		
	}
	
	
	public void alertValidation(String testType, String expectedResult) {
		Alert alert = driver.switchTo().alert();
		if (testType.equalsIgnoreCase("valid")) {
			String actualResult = alert.getText();
			Assert.assertEquals(actualResult,expectedResult);
			alert.accept();
		}else {
			String actualResult = alert.getText();
			Assert.assertEquals(actualResult,expectedResult);
			alert.accept();
		}
	}
	
	public void productDetailsCheck(WebElement elemnet) {
		String expectedNameString = elemnet.getText();
		String actualNameString = actualElementText(elemnet);
		Assert.assertEquals(actualNameString, expectedNameString);
	}
	
	public void optionIsDisplayedCheck(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
	}
	
	public static String Screenshot(String name) throws IOException {
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		String path="C:\\Users\\cmurugan\\eclipse-workspace\\MiniProject-1\\src\\test\\resources\\snap\\"+name+timeStamp+".png";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
		return path;
		
		
	}
	
	public void readPurchase() throws IOException {
		props = new Properties();
		FileReader reader = new FileReader("C:\\Users\\cmurugan\\eclipse-workspace\\MiniProject-1\\src\\test\\resources\\Data\\UserTestData.properties");
		props.load(reader);
	}
	
}

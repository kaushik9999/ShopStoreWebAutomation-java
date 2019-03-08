package org.HAAssignment.frameworkUtils;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.HAAssignment.ExcelLib.ExcelService;
import org.HAAssignment.Pages.ShoppingStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class WebDriverBase {
	public WebDriver driver;
	
	//Objects for Pages	
	public ShoppingStorePage ssp;
	public static String userName;
	
	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ssp = new ShoppingStorePage(driver); // initializing the object of Page
		
		driver.get("http://automationpractice.com/index.php");
		
	}
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}

	@DataProvider(name = "SampleAppTestData")
	public Iterator<Object[]> dataprovider2(Method method) {
		
		
		return new ExcelService().readTestDataFromExcel("TestData.xlsx","Data",method.getName()
				);

	}

}

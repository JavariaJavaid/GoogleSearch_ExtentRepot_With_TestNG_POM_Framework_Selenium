package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearch_Page;
public class GoogleSearch_Test
{
	
	
	static ExtentHtmlReporter ExtentHtmlRep;
	static ExtentReports ExtentRep;
	
	private static WebDriver driver =null;
	
	
	
//	public static void main(String args[])
//	{
//		ExtentHtmlReporter ExtentHtmlRep = new ExtentHtmlReporter("Extent.html");
//		ExtentReports ExtentRep = new ExtentReports();
//		ExtentRep.attachReporter(ExtentHtmlRep);
//		
//		ExtentTest  test = ExtentRep.createTest("Google search test 1","this is the test validate google search");
//		
//		System.setProperty("webdriver.chrome.driver","D:\\PSEB\\SETUP\\chromedriver 104\\chromedriver.exe");
//		driver=new ChromeDriver();
//		test.log(Status.INFO, "Starting TestCase");
//		
//		String BaseURL="https://www.google.com";
//		driver.get(BaseURL);
//		test.pass("Navigate to google Page");
//		
//		//GoogleSearchObj.Search_field("Selenium Automation");
//		test.pass("Entered text in search field");
//		
//		//GoogleSearchObj.Search_button();
//		test.pass("Pressed Keyboard entered");
//		
//	//	closeDriver();
//		test.pass("Close the browser");
	
	//}
	
	@BeforeTest
	public static void setup()
	{
		 ExtentHtmlRep = new ExtentHtmlReporter("Extent1.html");
		 ExtentRep = new ExtentReports();
		 ExtentRep.attachReporter(ExtentHtmlRep);
		
		
		//ExtentTest  test1 = ExtentRep.createTest("Google search test 1","this is the test validate google search");
		
		System.setProperty("webdriver.chrome.driver","D:\\PSEB\\SETUP\\chromedriver 104\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//test.log(Status.INFO, "Starting TestCase");
	}

	@Test
	public static void GoogleSearch()
	{
//		System.setProperty("webdriver.chrome.driver","D:\\PSEB\\SETUP\\chromedriver 104\\chromedriver.exe");
//		driver=new ChromeDriver();
//		String BaseURL="https://www.google.com";
//		driver.get(BaseURL);
		ExtentTest  test1 = ExtentRep.createTest("Google search test 1","this is the test validate google search");
		
		String BaseURL="https://www.google.com";
		driver.get(BaseURL);
		
		test1.pass("Navigate to google Page");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		
		GoogleSearch_Page GoogleSearchObj = new GoogleSearch_Page(driver);
		GoogleSearchObj.Search_field("Selenium Automation");
		test1.pass("Entered text in search field");
		
		GoogleSearchObj.Search_button();
		test1.pass("Pressed Keyboard entered");
		
		
		System.out.print("Google Search test pass");
	}
	
	@Test
	public static void DarkTheme()
	{
		ExtentTest test2 = ExtentRep.createTest("Google search test 2","this is the test validate google search");
		
		String BaseURL="https://www.google.com";
		driver.get(BaseURL);
		test2.pass("Navigate to google Page");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		
		GoogleSearch_Page GoogleSearchObj = new GoogleSearch_Page(driver);
		GoogleSearchObj.Setting_button();
		test2.pass("Setting button clicked");
		GoogleSearchObj.DarkTheme_Option();
		test2.pass("Pressed DarkThemeOption clicked");
		//again for turnOFF ..Testing Purpose
		
		System.out.print("Dark Theme test pass");
	}
	@AfterTest
	public static void CloseDriver()
	{
		
		driver.close();
		ExtentRep.flush();
	}
}
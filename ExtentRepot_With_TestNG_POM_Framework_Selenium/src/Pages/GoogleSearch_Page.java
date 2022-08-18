package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearch_Page
{
	
	//WebElement element = null;
	WebDriver driver = null;
	
	By SearchField = By.name("q");
	By SearchButton= By.xpath("(//input[@name='btnK'])[2]");
	By BlankSpace= By.xpath("//input[@name='q']/../../../..");
	By SettingButton = By.xpath("//div[text()='Settings']");
	//By DarkTheme = By.xpath("//div[contains(text(),'Dark theme')]");
	By DarkTheme = By.xpath("//div[contains(text(),'Dark theme')]/../..");
	
	
	public GoogleSearch_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void Search_field(String text)
	{
		driver.findElement(SearchField).sendKeys(text);
		 
	}
	
	public  void Search_button()
	{
		 driver.findElement(SearchButton).click();
		
	}
	public void Blank_Space()
	{
		driver.findElement(BlankSpace).click();
		
	}

	public  void Setting_button()
	{
		driver.findElement(SettingButton).click();
		
	}
	public  void DarkTheme_Option()
	{
	 driver.findElement(DarkTheme).click();
		
	}
}
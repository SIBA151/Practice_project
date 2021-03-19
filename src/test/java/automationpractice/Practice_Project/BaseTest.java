package automationpractice.Practice_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.PropertiesFileReader;

public class BaseTest {
	HomePage homepage;
	
	protected WebDriver driver;
	@Test
	public void browsersetup() {
		String browser = PropertiesFileReader.getconfigProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		String appUrl=PropertiesFileReader.getconfigProperty("appUrl");
		
		driver.get(appUrl);
		//driver.manage().window().maximize();
		homepage=new HomePage(driver);
	}

}

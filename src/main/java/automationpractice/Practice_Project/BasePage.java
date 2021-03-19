package automationpractice.Practice_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String pageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public WebElement getElement(By locator) {
		WebElement elm = driver.findElement(locator);
		return elm;
	}
	
	public String getElementText(By locator) {
		return driver.findElement(locator).getText();
	}
	public WebElement getElements(By locator, int get) {
		return driver.findElements(locator).get(get);
		
	}	
//	public String getAttribute(By locator, int get, String AtName) {
//		return driver.findElements(locator).get(get).getAttribute(AtName);
//		
//	}
	public int sizeElements(By locator) {
		return driver.findElements(locator).size();
	}

}

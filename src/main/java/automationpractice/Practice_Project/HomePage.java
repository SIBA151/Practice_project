package automationpractice.Practice_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automationpractice.Practice_Project.DRESSES.DRESSESPages;

public class HomePage extends BasePage {
	private By DressesLink=By.xpath("//a[@title='Dresses']");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getDresseslink() {
		return getElements(DressesLink, 1);
	}
	
	//click Dresses link
	public DRESSESPages clickDressesLink() {
		getDresseslink().click();
		return new DRESSESPages(driver);
	}
	

}

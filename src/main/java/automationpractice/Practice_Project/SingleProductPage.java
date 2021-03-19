package automationpractice.Practice_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automationpractice.Practice_Project.DRESSES.DRESSESPages;

public class SingleProductPage extends DRESSESPages{
	
	private By Colorlink=By.xpath("//ul[@id='color_to_pick_list']/li/a");
	private By AddCartBtn=By.xpath("//button[@class='exclusive']");
	private By Continue=By.xpath("//span[@title='Continue shopping']");

	public SingleProductPage(WebDriver driver) {
		super(driver);
	}
	public int getColorSize() {
		return sizeElements(Colorlink);
	}
	
	public WebElement getColorlink(int x) {
		return getElements(Colorlink,x);
	}
	
	public WebElement getcolorName() {
		return getElement(Colorlink);		
	}
	
	public WebElement getAddCartBtn() {
		return getElement(AddCartBtn);
	}
	
	public WebElement getContinueBtn() {
		return getElement(Continue);
	}
	//get color names
	public String ColorName(int x) {
		String AttributeName="name";
		return getColorlink(x).getAttribute(AttributeName);
	}
	//click color
	public void ClickColor(int x) {
		getColorlink(x).click();
	}
	//click add cart btn
	public void ClickAddCartBtn() {
		getAddCartBtn().click();
	}
	//click continue btn
	public void ClickContinueBtn() {
		getContinueBtn().click();
	}
	
	
//	public DRESSESPages clolo1rChoise() {
//		int colorcount=sizeElements(Singleproduct);
//		String yellow="Yellow";
//		
//		for(int j=0;j<colorcount;j++) {
//			String urlColor= getAttribute(Singleproduct,j, Attname);
//			
//			if(yellow.equalsIgnoreCase(urlColor)) {
//			getElements(Singleproduct, j).click();
//			getElement(AddCartBtn).click();
//			getElement(Continue).click();
//			driver.navigate().back();
//			}
//		}
//		driver.navigate().back();
//		return new DRESSESPages(driver);
//	}

}











//public DRESSESPages clolorChoise() {
//	int colorcount=sizeElements(Singleproduct);
//	String yellow="Yellow";
//	String Attname="name";
//	for(int j=0;j<colorcount;j++) {
//		String urlColor= getAttribute(Singleproduct,j, Attname);
//		
//		if(yellow.equalsIgnoreCase(urlColor)) {
//		getElements(Singleproduct, j).click();
//		getElement(AddCartBtn).click();
//		getElement(Continue).click();
//		driver.navigate().back();
//		}
//	}
//	driver.navigate().back();
//	return new DRESSESPages(driver);
//}
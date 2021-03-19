package automationpractice.Practice_Project.DRESSES;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import automationpractice.Practice_Project.BasePage;
import automationpractice.Practice_Project.SingleProductPage;

public class DRESSESPages extends BasePage {
	private By productlist = By.xpath("//ul[@class='product_list grid row']/li/div");
	private By productlink = By.xpath("//ul[@class='product_list grid row']/li/div/div[2]/h5/a");
	
	public DRESSESPages(WebDriver driver) {
		super(driver);
	}
	public int ProductList() {
		return sizeElements(productlist);
	}
	
	public String GetSinProlink(int x) {
		String AttributeName="href";
		return getElements(productlink,x).getAttribute(AttributeName);
	}
	//click SingleProduct
	public SingleProductPage SingleProductclick(int x) {
		driver.navigate().to(GetSinProlink(x));
		return new SingleProductPage(driver);
	}
	
	

}











//public SingleProductPage everyProlductclick() {
//	int count=sizeElements(productlist);
//	String AttributeName="href";
//	for(int i=0; i<count;i++) {
//		String urlLink=getAttribute(productlist, i, AttributeName);
//		driver.navigate().to(urlLink);
//		
//		
//	}
//	return new SingleProductPage(driver);
//	
//}
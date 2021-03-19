package automationpractice.Practice_Project;

import org.testng.annotations.Test;

import automationpractice.Practice_Project.DRESSES.DRESSESPages;

public class DRESSESTest extends BaseTest{
	DRESSESPages DP;
	private String yellow="Yellow";
	@Test
	public  void chooseProduct() throws InterruptedException {
		
		
		DP = homepage.clickDressesLink();
		
			Thread.sleep(3000);
		
		int count=DP.ProductList();	
		System.out.println(count);
		for(int i=0;i<count;i++) {
			SingleProductPage singleproductpage = DP.SingleProductclick(i);
			int countcolor=singleproductpage.getColorSize();
			for(int j=0;j<countcolor;j++) {
				String colorname=singleproductpage.ColorName(j);
				
					Thread.sleep(3000);
				
				if(yellow.equalsIgnoreCase(colorname)) {
					singleproductpage.ClickColor(j);
					singleproductpage.ClickAddCartBtn();
					Thread.sleep(3000);
					singleproductpage.ClickContinueBtn();
					driver.navigate().back();
				}
			}
			driver.navigate().back();
		}
		
	}

}

package automationpractice.Practice_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationpractice {
	public WebDriver driver;

	String yellow="Yellow";
	
	@BeforeClass
	public  void  loginpage() {
		
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				//driver.manage().window().maximize();
				driver.get("http://automationpractice.com/index.php");
	}
	@Test
	public void tsetapp() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElements(By.xpath("//a[@title='Dresses']")).get(1).click();
		//
	    int count=driver.findElements(By.xpath("//ul[@class='product_list grid row']/li/div")).size();
	    System.out.println(count);
	    //
	    
	    for(int i=0; i<count;i++) {
	    	String link=driver.findElements(By.xpath("//ul[@class='product_list grid row']/li/div")).get(i).getText();
	    	String linkUrl=driver.findElements(By.xpath("//ul[@class='product_list grid row']/li/div/div[2]/h5/a")).get(i).getAttribute("href");

	    	System.out.println(link+" ========== "+linkUrl);
	    	driver.navigate().to(linkUrl);
	    	Thread.sleep(2000);
	    	
	    	int colorcount=driver.findElements(By.xpath("//ul[@id='color_to_pick_list']/li/a")).size();
	    	System.out.println(colorcount+"===========");

    		
	    	for(int j=0;j<colorcount;j++) {
	    		
	    		String urlcolor=driver.findElements(By.xpath("//ul[@id='color_to_pick_list']/li/a")).get(j).getAttribute("name");
    		    
	    		System.out.println(urlcolor);
	    		
	    		if(yellow.equalsIgnoreCase(urlcolor)) {
	    		Thread.sleep(3000);
	    		driver.findElements(By.xpath("//ul[@id='color_to_pick_list']/li/a")).get(j).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//button[@class='exclusive']")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
	    		Thread.sleep(2000);
	    		driver.navigate().back();
	    		}

         	}
	    	Thread.sleep(4000);
			driver.navigate().back();
			
	    }
	   
	    
	}
	


}

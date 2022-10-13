package Ebay;

import org.testng.annotations.Test;

import Common.Utilities;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BuyEbay extends Utilities{
 
	
	@Test
  public void f() throws InterruptedException {
		Search ce=new Search(driver);
		Thread.sleep(6000);
		ce.TapOnSearchBar();
		TypeLaptop cp= new TypeLaptop(driver);
		Thread.sleep(5000);
		cp.ClickSearchLaptop();

		
		
		//advantage of find elements
		int linked= driver.findElements(By.tagName("a")).size();
		System.out.println("Total number of link = " +linked);
		
		int homelinked= driver.findElements(By.xpath("//span[text()='Home']")).size();
		System.out.println("Ebay home count = " +homelinked);
		
		if (homelinked==1) {
			driver.findElement(By.xpath("//span[text()='Home']")).click();
			
		}else {
			System.out.println("Element is not dispalying");
		}
	}
 /* @BeforeClass
  public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe ");
		driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
  
  
  }

  @AfterClass
  public void afterClass() {
  
  }*/

}

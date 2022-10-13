package TestNG;

import org.testng.annotations.Test;

import Common.Utilities;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestSession extends Utilities{
 
	
	
	@Test
  public void f() throws InterruptedException {
  
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		ob.keyUp(Keys.CONTROL);
		Thread.sleep(6000);
		ob.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
  
  }
 

 /* @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe ");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	
		Thread.sleep(6000);
		driver.manage().window().maximize();
  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }*/
  
  
}

package com.train.org.project.selenium;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiplewindowsSwitch {

		static WebDriver driver;
		static String URL = "https://www.anazon.com";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.get(URL);
	
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		
		//Thread.sleep(6000);
		
		WebDriverWait oi= new WebDriverWait(driver, null);
		oi.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Books")));
		//to open another page within in the browser
		WebElement multibrowser= driver.findElement(By.linkText("Books"));
		Actions ob= new Actions(driver);
		ob.sendKeys(Keys.SHIFT).build().perform();
		multibrowser.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		
		

		/*Set<String> windowhandle =driver.getWindowHandles();
		Iterator<String> iterator=windowhandle.iterator();
		String FirstWindowHandle= iterator.next();
		String SecondWindowHandle= iterator.next();
		
		driver.switchTo().window(SecondWindowHandle);
		
		System.out.println(FirstWindowHandle);
		System.out.println(SecondWindowHandle);*/
		
		//Thread.sleep(10000);
		WebElement Books= driver.findElement(By.xpath("//a[text()='Book Merch Shop']"));
		Books.click();
		
		
		
	
	
	}

}

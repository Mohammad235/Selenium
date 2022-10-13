package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionToControl {

	static WebDriver driver;
	
	static String URL = "https://www.amazon.com";
	
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe ");
		driver=new ChromeDriver();
		driver.get(URL);
	
	
		driver.manage().window().maximize();
		
		//to hover over 
		WebElement Signed= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions act= new Actions(driver);
		act.moveToElement(Signed).build().perform();
	
		//to pick specific object from the drop down list
		WebElement PrimeMembership= driver.findElement(By.xpath("//*[text()= 'Prime Membership']"));
		act.moveToElement(PrimeMembership).build().perform();
		PrimeMembership.click();
	
		Thread.sleep(6000);
		driver.close();
	
	}

}

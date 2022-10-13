package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	static WebDriver driver;
	
	static String URL = "https://demoqa.com/alerts";
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe ");
		driver=new ChromeDriver();
		driver.get(URL);
	
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
	
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
	
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("Mohammad");
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
		Thread.sleep(6000);
		driver.close();
	
	
	}

}

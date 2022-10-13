package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {

	static WebDriver driver;
	
	static String URL = "https://www.expedia.com/Flights";
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe ");
		driver=new ChromeDriver();
		driver.get(URL);
	
	
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("d1-btn")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@aria-label='Oct 26, 2022']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@aria-label='Nov 26, 2022']")).click();
	
	
	
	
	
	
	
	
	
	}

}

package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {

	
	static WebDriver driver;
	
	static String URL = "https://www.facebook.com";
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe ");
		driver=new ChromeDriver();
		driver.get(URL);
		
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		String titles= driver.findElement(By.xpath("//*[contains(text(), 'Connect with friends')]")).getText();
		System.out.println(titles);
	
		
		Thread.sleep(6000);
		driver.close();
	
	
	
	}

}

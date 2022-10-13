package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DarggAndDropp {

    static WebDriver driver;
	
	static String URL = "https://jqueryui.com/droppable/";
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe ");
		driver=new ChromeDriver();
		driver.get(URL);
	
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		
		driver.switchTo().frame(0);
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions obj= new Actions(driver);
		obj.dragAndDrop(drag, drop).build().perform();
		
		//to get back to the main iframe
		driver.switchTo().parentFrame();
		
		
		WebElement Resizable = driver.findElement(By.linkText("Resizable"));
		Resizable.click();
	
	
	
	
	}

}

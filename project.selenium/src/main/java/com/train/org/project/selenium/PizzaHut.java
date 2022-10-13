package com.train.org.project.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class PizzaHut {

		static WebDriver driver;
		
		static String URL = "https://www.pizzahut.com/";
		
		
		
		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub

		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe" );
			driver= new ChromeDriver();
			driver.get(URL);
		
			Thread.sleep(6000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			//pizza hut menu
			WebElement menu= driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			menu.click();
			
			// click pizza
			Thread.sleep(6000);
			WebElement clickPizzas= driver.findElement(By.xpath("//a[@data-testid='link-menu-pizza-link']"));
			clickPizzas.click();
			
			//choose supreme pizza
			Thread.sleep(6000);
			WebElement supreamPizza= driver.findElement(By.xpath("//p[text()='Supreme Pizza']"));
			supreamPizza.click();
			
			Thread.sleep(3000);
			WebElement Carryout= driver.findElement(By.xpath("//div[text()='CARRYOUT']"));
			Carryout.click();
			
			
			Thread.sleep(3000);
			WebElement EnterZipCode= driver.findElement(By.id("carryout-city-state-zip"));
			EnterZipCode.click();
			EnterZipCode.sendKeys("08401");
			
			Thread.sleep(6000);
			WebElement Search= driver.findElement(By.xpath("//span[text()='Search']"));
			Search.click();
			

			Thread.sleep(8000);
			WebElement Continue= driver.findElement(By.xpath("//span[text()='Continue']"));
			Continue.click();
			
			
			Thread.sleep(10000);
			WebElement supreamPizzaOptoin= driver.findElement(By.xpath("//p[text()='Supreme Pizza']"));
			supreamPizzaOptoin.click();
			
			Thread.sleep(15000);
			WebElement Crust= driver.findElement(By.xpath("//h2[text()='Crust']"));
			Crust.click();
			
			
			//choose size Medium
			Thread.sleep(10000);
			WebElement Size=driver.findElement(By.xpath("//p[text()='Medium']"));
			Size.click();
			
			//choose the crust type Original plan
			
			Thread.sleep(8000);
			WebElement CrustType= driver.findElement(By.xpath("//p[text()='Original Pan® Pizza']"));
			CrustType.click();
			
			//Add to order
			Thread.sleep(8000);
			WebElement AddtoOder= driver.findElement(By.xpath("//span[text()='add to order']"));
			AddtoOder.click();
			
			
			//View order finally
			Thread.sleep(10000);
			WebElement ViewOrder= driver.findElement(By.xpath("//span[text()='View order']"));
			ViewOrder.click();
			
			ScreenShots();
			ScreenShots();
			Thread.sleep(6000);
			driver.close();
			
			
		
		}
		
		
		//ScreenShot of the Checkout details 
		public static void ScreenShots() throws IOException {
		File HomeStPage= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(HomeStPage, new File("C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Picture\\CheckouDetails.png"));
		
		

		}

}
		

/*Thread.sleep(3000);
WebElement StreetAdress= driver.findElement(By.id("w2-address"));
StreetAdress.click();
StreetAdress.sendKeys("1541 Atlantic Ave");

Thread.sleep(3000);
WebElement aptNumber= driver.findElement(By.name("deliveryAddress2"));
aptNumber.click();
aptNumber.sendKeys("2");

Thread.sleep(3000);
WebElement CityName= driver.findElement(By.id("w2-city"));
CityName.click();
CityName.sendKeys("Atlantic City");

Thread.sleep(3000);
WebElement StateName= driver.findElement(By.id("w2-state"));
StateName.click();
StateName.sendKeys("NJ");

Thread.sleep(3000);
WebElement Zipcode= driver.findElement(By.id("w2-zip"));
Zipcode.click();
Zipcode.sendKeys("08401");*/


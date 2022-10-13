package com.train.org.project.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class EdgeBrowserSetUp {

	static WebDriver driver;
	static String URL= "https://www.facebook.com";
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		Ibrowser("Chrome");
		
		ScreenShot();
		Thread.sleep(6000);
		driver.close();
	
	}
	
	public static void Ibrowser(String NameofBrowser) {
		
		if (NameofBrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe ");
			driver=new ChromeDriver();
			driver.get(URL);
			
			driver.manage().window().maximize();
			String titles= driver.findElement(By.xpath("//*[contains(text(), 'Connect with friends')]")).getText();
			System.out.println(titles);
			
		
		
		}else if(NameofBrowser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver","C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\msedgedriver.exe" );
			driver= new EdgeDriver();
			driver.get(URL);
			
			
			driver.manage().window().maximize();
			String titles= driver.findElement(By.xpath("//*[contains(text(), 'Connect with friends')]")).getText();
			System.out.println(titles);
			driver.close();
			
		}
	
	}
	
	//to take screen shots and to save it 
	public static void ScreenShot() throws IOException {
		Date obj= new Date();
		System.out.println(obj);
		String file= obj.toString().replace(" ", "_").replace(":","_");
		System.out.println(file);
	File HomeStPage= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(HomeStPage, new File("C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Picture\\" + file + "Home.png"));
	
	}
}

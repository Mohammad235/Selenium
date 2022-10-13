package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v102.css.model.SelectorList;
import org.openqa.selenium.support.ui.Select;

public class IBrowser {

	static WebDriver driver;
	
	static String URL = "https://www.facebook.com";
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Driver\\chromedriver.exe ");
	driver=new ChromeDriver();
	driver.get(URL);
	
	//Thread.sleep(6000);
	//driver.navigate().refresh();
	
	//Thread.sleep(6000);
	//to maximize the screen
	driver.manage().window().maximize();
	//to minimize the screen
	//driver.manage().window().minimize();
	
	//driver.navigate().back();
	
	//Thread.sleep(6000);
	//driver.navigate().forward();
    
	//to get the session ID
	String windows= driver.getWindowHandle();
	System.out.println(windows);
	
	//to get the current URL 
	String URL= driver.getCurrentUrl();
	System.out.println(URL);
	
	//to get the title of the browser
	String Title =driver.getTitle();
	System.out.println(Title);
	//Thread.sleep(2000);
	
	
	
	/*WebElement UserField=driver.findElement(By.id("email"));
	UserField.sendKeys("Mohammad235");
	//Thread.sleep(6000);
	WebElement PasswordField= driver.findElement(By.name("pass"));
	PasswordField.sendKeys("Nadim235");
	WebElement LogButton=driver.findElement(By.name("login"));
	//LogButton.click();*/
	
	;
	
	
	//Creating new account in facebook 
	WebElement createAccount= driver.findElement(By.linkText("Create new account"));
	createAccount.click();
	Thread.sleep(6000);
	
	//first name
	WebElement FirstName = driver.findElement(By.name("firstname"));
	FirstName.click();
	FirstName.sendKeys("Mohammad");
	
	//Last name
	WebElement LastName = driver.findElement(By.name("lastname"));
	LastName.click();
	LastName.sendKeys("Nahin");
	
	//your phone number 
	WebElement PhoneNumber = driver.findElement(By.name("reg_email__"));
	PhoneNumber.click();
	PhoneNumber.sendKeys("609-215-3120");
	
	//new password
	WebElement Password = driver.findElement(By.id("password_step_input"));
	Password.click();
	Password.sendKeys("Nadim235");
	
	//Birthday
	WebElement Month = driver.findElement(By.name("birthday_month"));
	Select ob=new Select(Month);
	ob.selectByVisibleText("Sep");
	Thread.sleep(3000);
	//Day
	WebElement Day  = driver.findElement(By.name("birthday_day"));
	Select obj=new Select(Day);
	obj.selectByVisibleText("21");
	
	//Year
	WebElement Year  = driver.findElement(By.name("birthday_year"));
	Select ob2=new Select(Year);
	ob2.selectByVisibleText("2021");
	/*
	// Using xPath(Absolute Xpath) locators to find element (Indexing)
	WebElement Toggoles= driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]"));
	Toggoles.click();
	
	//using the relative Xpath 
	WebElement Submit= driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']"));
	Submit.click();
	
	//Contains() xPath
	WebElement Forgot= driver.findElement(By.xpath("//*[contains(text(), 'Forgot')]"));
	Forgot.click();*/
	
	
	Thread.sleep(8000);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

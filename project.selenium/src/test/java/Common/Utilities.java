package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utilities {

	public WebDriver driver;
	
	
	@Parameters({"browser", "website"})
  @BeforeClass
  public void Ibrowser(String NameofBrowser, String url) throws InterruptedException {
		String kl= System.getProperty("user.dir");
		System.out.println(kl);
			
			if (NameofBrowser.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver", kl+"\\Driver\\chromedriver.exe ");
				driver=new ChromeDriver();
				driver.get(url);
				//driver.get("https://www.ebay.com");
				Thread.sleep(6000);
				driver.manage().window().maximize();
				
				
			
			
			}else if(NameofBrowser.equalsIgnoreCase("Edge")) {
				
				System.setProperty("webdriver.edge.driver", kl+ "\\Driver\\msedgedriver.exe" );
				driver= new EdgeDriver();
				driver.get(url);
				//driver.get("https://www.amazon.com");
				driver.manage().window().maximize();

			}	
  
	  }
  

  @AfterClass
  public void afterClass() throws IOException {
	 ScreenShot();
	  
	  driver.quit();
  
  
  }

  public  void ScreenShot() throws IOException {
		Date obj= new Date();
		System.out.println(obj);
		String file= obj.toString().replace(" ", "_").replace(":","_");
		
	File HomeStPage= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(HomeStPage, new File("C:\\Users\\mdi77\\eclipse-workspace\\project.selenium\\Picture\\" + file + "Home.png"));
	
  
  
  
  		}
  
}

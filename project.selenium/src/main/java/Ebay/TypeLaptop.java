package Ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class TypeLaptop {
		WebDriver driver;
		@FindBy(id = "gh-btn") WebElement cp;


		public void ClickSearchLaptop() {
			cp.click();
		}


		public TypeLaptop(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);

		}
	
	
}
	


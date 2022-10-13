package Ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	WebDriver driver;
	@FindBy(id = "gh-ac") WebElement el;


public void TapOnSearchBar() {
	el.click();
	el.sendKeys("Laptop");
}
public Search(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
}
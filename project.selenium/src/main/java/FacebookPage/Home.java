package FacebookPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
WebDriver driver;

@FindBy(name = "email") WebElement FieldEmail;
@FindBy(name = "pass") WebElement passwrd;
@FindBy(name = "login") WebElement linbt;
public Home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
public void fieldForEmail(String name) {
	FieldEmail.clear();
	FieldEmail.sendKeys(name);
}
public void passwordField(String pass) {
	passwrd.sendKeys(pass);
}
public void loginfield() {
	linbt.click();
}
}

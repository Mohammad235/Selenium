package TestNG;

import org.testng.annotations.Test;

import Common.Utilities;
import FacebookPage.Home;

import org.testng.annotations.DataProvider;

public class Providing extends Utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  Home h= new Home(driver);
	  h.fieldForEmail(n);
	  Thread.sleep(6000);
	  h.passwordField(s);
	  Thread.sleep(6000);
	  h.loginfield();
	  driver.navigate().back();
  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"tested", "password" },
      new Object[] { "tested234", "b89" },
      new Object[] {"", "b34"}
    };
  }
}

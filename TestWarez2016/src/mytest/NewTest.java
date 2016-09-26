package mytest;

import org.testng.annotations.Test;

import forEvo.ForEvoSeleniumTest;
import fp.forevo.manager.TafException;
import general.SimpleSeleniumTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test(enabled = false)
  public void f() {
	  /*SimpleSeleniumTest test = new SimpleSeleniumTest();
	  test.openMainPageAndClickLogin();
	  test.createNewAcc();
	  test.logOut();
	  test.logIn();
	  test.logOut();*/
  }
  
  @Test
  public void ff() throws TafException {
	  ForEvoSeleniumTest fe = new ForEvoSeleniumTest();
	  
	  fe.openMainPageAndClickLogin();
	  fe.createNewAcc();
  }
  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
  }
}

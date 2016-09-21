package mytest;

import org.testng.annotations.Test;

import general.SimpleSeleniumTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  SimpleSeleniumTest test = new SimpleSeleniumTest();
	  test.openMainPageAndClickLogin();
	  test.createNewAcc();
	  test.logOut();
	  test.logIn();
	  test.logOut();
  }
  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
  }
}

package mytest;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.CreateAccPage;
import general.Kalkulator;
import general.LoginPage;
import general.MainPage;

public class SimpleTest {
	@Test(enabled=false)
	  public void f() throws FindFailed {
		  
		  mp.loadMainPage();
		  /*lp = mp.openLoginPage();
		  
		  cap = lp.creatNewAcc();
		  cap.fillInForm();*/
		  
		  mp.openLoginPage().creatNewAcc().fillForm();
		  mp.logOut().logIn();
		  mp.logOut();
		  
	  }
	
	@Test
	public void ff() throws InterruptedException {
		Kalkulator k  = new Kalkulator();
		k.onlyAutoIt();
	}
	  @BeforeClass
	  public void beforeClass() throws IOException {
		  //mp = new MainPage();
	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  
	  MainPage mp;
	  LoginPage lp;
	  CreateAccPage cap;
}

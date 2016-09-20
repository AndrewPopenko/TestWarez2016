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
	@Test(priority=1)
	  public void f() throws FindFailed {
		  
		  mp.loadMainPage();
		  /*lp = mp.openLoginPage();
		  
		  cap = lp.creatNewAcc();
		  cap.fillInForm();*/
		  
		  mp.openLoginPage().creatNewAcc().fillForm();
		  mp.logOut().logIn();
		  mp.logOut();
		  
	  }
	
	@Test(priority=2)
	public void ff() throws InterruptedException, FindFailed {
		Kalkulator k  = new Kalkulator();
		k.withSykuli();
	}
	
	@Test(priority=3)
	public void fff() throws InterruptedException, FindFailed {
		Kalkulator k  = new Kalkulator();
		k.onlyAutoIt();
	}
	
	  @BeforeClass
	  public void beforeClass() throws IOException {
		  mp = new MainPage();
	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  
	  MainPage mp;
	  LoginPage lp;
	  CreateAccPage cap;
}

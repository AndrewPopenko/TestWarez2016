package mytest;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import general.Kalkulator;
import general.MainPage;

public class SimpleTest {
	@Test(priority=1, enabled=false)
	public void baz() throws FindFailed, IOException {
		MainPage mp = new MainPage();
		mp.loadMainPage();
		mp.openLoginPage().creatNewAcc().fillForm();
		mp.logOut().logIn();
		mp.logOut();
	}
	
	@Test(priority=2)
	public void foo() throws InterruptedException, FindFailed {
		Kalkulator k  = new Kalkulator();
		k.withSikuli();
	}
	
	@Test(priority=3)
	public void bar() throws InterruptedException, FindFailed {
		Kalkulator k  = new Kalkulator();
		k.withAutoIt();
	}
	
	@Test(priority=4)
	public void foobar() throws FindFailed {
		Kalkulator k = new Kalkulator();
		k.mix();
	}
	
	@BeforeClass
	public void beforeClass() throws IOException {
	}

	@AfterClass
	public void afterClass() {
	}
	  
	  
}

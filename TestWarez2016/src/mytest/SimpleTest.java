package mytest;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import forEvo.ForEvoSeleniumTest;
import fp.forevo.manager.TafException;
import general.Kalkulator;
import general.MainPage;
import general.SimpleSeleniumTest;

public class SimpleTest {
	@Test(priority=5, enabled = false)
	public void baz_old() throws FindFailed, IOException {
		MainPage mp = new MainPage();
		mp.loadMainPage();
		mp.openLoginPage().creatNewAcc().fillForm();
		mp.logOut().logIn();
		mp.logOut();
		mp.closeBrowser();
	}
	
	//WebDriver
	@Test(priority=1, enabled = false)
	public void bazW() {
		SimpleSeleniumTest simpleTest = new SimpleSeleniumTest();
		simpleTest.openMainPageAndClickLogin();
		simpleTest.createNewAcc();
		simpleTest.logOut();
		simpleTest.logIn();
		simpleTest.logOut();
		simpleTest.closeBrowser();
	}
	
	//ForEvo
	@Test(priority=6, enabled = true)
	public void bazF() throws TafException {
		ForEvoSeleniumTest forEvoTest = new ForEvoSeleniumTest();
	  
		forEvoTest.openMainPageAndClickLogin();
		forEvoTest.createNewAcc();
		forEvoTest.logOut();
		forEvoTest.logIn();
		forEvoTest.logOut();
		forEvoTest.closeBrowser();
	}
	
	@Test(priority=2, enabled = false)
	public void foo() throws InterruptedException, FindFailed {
		Kalkulator k  = new Kalkulator();
		k.withSikuli();
	}
	
	@Test(priority=3, enabled = false)
	public void bar() throws InterruptedException, FindFailed {
		Kalkulator k  = new Kalkulator();
		k.withAutoIt();
	}
	
	@Test(priority=4, enabled = false)
	public void foobar() throws FindFailed {
		Kalkulator k = new Kalkulator();
		k.mix();
	}
	
	//@Test(priority)
	
	@BeforeClass
	public void beforeClass() throws IOException {
	}

	@AfterClass
	public void afterClass() {
	}
	  
	  
}

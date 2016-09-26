package forEvo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import forEvo.maps.ForEvoSeleniumTestMap;
import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TafException;
import fp.forevo.proxy.Browser;
import jnr.ffi.ObjectReferenceManager;


public class ForEvoSeleniumTest extends ForEvoSeleniumTestMap {
	public ForEvoSeleniumTest() {
		runBrowser(Browser.Firefox, "szkolenia.forprogress.com.pl:8000/gardenstore");
		//runBrowser(Browser.Firefox, "http://localhost:8181/gardenstore/pl/");		
	}
	
	public void openMainPageAndClickLogin() throws TafException {
		btnLogIn.click();
	}
	
	public void createNewAcc() throws TafException {
		editCreateMail.setText(user);
		btnCreateAcc.click();
		
		rbMale.click();
		editFirstName.setText("FirstName");
		editLastName.setText("LastName");
		editPswd.setText(pswd);
		
		selectDays.selectByValue("10");
		selectMonths.selectByVisibleText("Czerwiec ");
		selectYears.selectByValue("1983");

		//chbNews.click();
		//chbOptin.click();
		
		btnSubmit.click();
		
		objMess.waitForVisible();
	}
	
	public void logOut() throws TafException {
		btnLogOut.click();
	}
	
	public void logIn() throws TafException {
		editEmail.setText(user);
		editPswd.setText(pswd);
		btnLoginToAcc.click();
		objMess1.waitForVisible();
	}
	
	public void closeBrowser() {
		browser.close();
		
	}
	
	private String user = "test30@test.pl";
	private String pswd = "qwerty123";
	
}
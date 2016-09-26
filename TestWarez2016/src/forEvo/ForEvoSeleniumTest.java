package forEvo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import forEvo.maps.ForEvoSeleniumTestMap;
import fp.forevo.manager.MasterScript;
import fp.forevo.manager.TafException;
import fp.forevo.proxy.Browser;


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
		
		//czekamy na pojawienie tekstu - konto stworzone domyœlnie
		//new WebDriverWait(driver, 5).
		//	until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='center_column']/p[1]")));
	}
	
	private String user = "test112@test.pl";
	private String pswd = "qwerty123";
}
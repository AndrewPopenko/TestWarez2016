package general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleSeleniumTest {
	
	public SimpleSeleniumTest() {
		driver = new  FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void openMainPageAndClickLogin() {
		driver.get("szkolenia.forprogress.com.pl:8000/gardenstore");
		
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
		
		btnLogin.click();	
	}
	
	public void createNewAcc() {				
		WebElement editCreateMail = driver.findElement(By.id("email_create"));
		WebElement btnCreateAcc   = driver.findElement(By.id("SubmitCreate"));
		
		editCreateMail.sendKeys(user);
		btnCreateAcc.click();
		
		WebElement rbMale 		  = driver.findElement(By.id("id_gender1"));
		WebElement editFirstName  = driver.findElement(By.id("customer_firstname"));
		WebElement editLastName	  = driver.findElement(By.id("customer_lastname"));
		WebElement editPswd 	  = driver.findElement(By.id("passwd"));
		WebElement selectDays 	  = driver.findElement(By.id("days"));
		WebElement selectMonths   = driver.findElement(By.id("months"));
		WebElement selectYears 	  = driver.findElement(By.id("years"));
		WebElement chbNews 		  = driver.findElement(By.id("newsletter"));
		WebElement chbOptin 	  = driver.findElement(By.id("optin"));
		WebElement btnSubmit 	  = driver.findElement(By.id("submitAccount"));
		
		rbMale.click();
		editFirstName.sendKeys("FirstName");
		editLastName.sendKeys("LastName");
		editPswd.sendKeys("qwerty123");
		
		//praca z comboBoxami
		Select select = new Select(selectDays);
		select.selectByValue("10");

		select = new Select(selectMonths);
		select.selectByVisibleText("Czerwiec ");

		select = new Select(selectYears);
		select.selectByValue("1983");

		chbNews.click();
		chbOptin.click();

		btnSubmit.click();

		//czekamy na pojawienie tekstu - konto stworzone domyœlnie
		new WebDriverWait(driver, 5).
			until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='center_column']/p[1]")));
	}
	
	public void logOut() {
		WebElement btnLogOut = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a"));
		btnLogOut.click();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void logIn() {
		WebElement editEmail = driver.findElement(By.id("email"));
		WebElement editPswd	 = driver.findElement(By.id("passwd"));
		WebElement btnSubmit = driver.findElement(By.id("SubmitLogin"));
		
		editEmail.sendKeys(user);
		editPswd.sendKeys(pswd);
		btnSubmit.click();		
	}
	
	//Czesc Lukasz
	
	WebDriver driver;
	
	private String user = "test111@test.pl";
	private String pswd = "qwerty123";
}

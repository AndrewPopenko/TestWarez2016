package general;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Praca z g³ówn¹ stron¹
public class MainPage {

	public MainPage() throws IOException {
		final String firebugPath = "D:\\Andrew\\ff_profile\\firebug-2.0.17-fx.xpi";
		FirefoxProfile profile = new FirefoxProfile();       
		profile.addExtension(new File(firebugPath));
		
		driver = new  FirefoxDriver(profile);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	// l¹dowanie strony g³ównej 
	public void loadMainPage() {
		driver.get("http://localhost:8181/gardenstore/pl/");
	}
	
	
	public LoginPage openLoginPage() {
		btnLogin.click();
		return new LoginPage(driver);
	}
	
	public LoginPage logOut() {
		btnLogOut.click();
		return new LoginPage(driver);
	}
	
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	private WebElement btnLogin;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[2]/a")
	private WebElement btnLogOut;
}

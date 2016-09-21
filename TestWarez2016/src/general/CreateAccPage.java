package general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*Klasa odpowiada za tworzenie nowego konta u¿ytkownika*/
public class CreateAccPage {
	
	public CreateAccPage(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this);
	}
	
	//Wype³niæ wszystkie po³a i potwierdziæ utworzenie nowego konta
	public CreateAccPage fillForm() {
		rbMale.click();
		editFirstName.sendKeys("FirstName");
		editLastName.sendKeys("LastName");
		editPswd.sendKeys("qwerty123");
		
		//praca z comboBoxami
		Select sl = new Select(selectDays);
		sl.selectByValue("10");
		
		sl = new Select(selectMonths);
		sl.selectByVisibleText("Czerwiec ");
		
		sl = new Select(selectYears);
		sl.selectByValue("1983");
		
		chbNews.click();
		chbOptin.click();
		
		btnSubmit.click();
		
		//czekamy na pojawienie tekstu - konto stworzone domyœlnie
		new WebDriverWait(driver, 5).
			until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='center_column']/p[1]")));
		
		return this;
	}
	
	private WebDriver driver;
	
	//radioButton - Male
	@FindBy(xpath="//*[@id='id_gender1']")
	private WebElement rbMale;
	
	//radioButton - Female
	@FindBy(xpath="//*[@id='id_gender2']")
	private WebElement rbFemale;
	
	@FindBy(xpath="//*[@id='customer_firstname']")
	private WebElement editFirstName;
	
	@FindBy(xpath="//*[@id='customer_lastname']")
	private WebElement editLastName;
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement editEMail;
	
	@FindBy(xpath="//*[@id='passwd']")
	private WebElement editPswd;
	
	@FindBy(xpath="//*[@id='days']")
	private WebElement selectDays;	
	
	@FindBy(xpath="//*[@id='months']")
	private WebElement selectMonths;
	
	@FindBy(xpath="//*[@id='years']")
	private WebElement selectYears;
	
	//chb - checkbox (HTML - type="checkbox")
	
	@FindBy(xpath="//*[@id='newsletter']")
	private WebElement chbNews;
	
	@FindBy(xpath="//*[@id='optin']")
	private WebElement chbOptin;
	
	@FindBy(xpath="//*[@id='submitAccount']")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//*[@id='center_column']/p[1]")
	private WebElement staticTextSuccess;
}
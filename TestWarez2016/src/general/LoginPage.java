package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public CreateAccPage creatNewAcc() {
		editCreateMail.sendKeys(user);
		btnCreateAcc.click();
		
		return new CreateAccPage(driver);
	}

	public void logIn() {
		editEmail.sendKeys(user);
		editPswd.sendKeys(pswd);
		btnSubmit.click();
	}
	
	private WebDriver driver;
	
	private String user = "test5@test.pl";
	private String pswd = "qwerty123";
	
	@FindBy(xpath = "//*[@id='email_create']")
	private WebElement editCreateMail;
	
	@FindBy(xpath = "//*[@id='SubmitCreate']")
	private WebElement btnCreateAcc;
	
	@FindBy(xpath = "//*[@id='email']")
	private WebElement editEmail;
	
	@FindBy(xpath = "//*[@id='passwd']")
	private WebElement editPswd;
	
	@FindBy(xpath = "//*[@id='SubmitLogin']")
	private WebElement btnSubmit;
}

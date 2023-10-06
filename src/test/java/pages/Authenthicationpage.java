package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authenthicationpage {
	WebDriver driver=null;
	public Authenthicationpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="email_create")
	private WebElement createaccountemail;
	@FindBy (id="SubmitCreate")
	private WebElement createaccountsubmitbutton;
	
	@FindBy (id="email")
	private WebElement loginemail;
	
	@FindBy (id="passwd")
	private WebElement loginpassword;
	
	@FindBy (id="SubmitLogin")
	private WebElement loginsubmitbutton;

	public WebElement getCreateaccountemail() {
		return createaccountemail;
	}

	public void setCreateaccountemail(String createaccountemail) {
		this.createaccountemail .sendKeys(createaccountemail);
	}

	public WebElement getLoginemail() {
		return loginemail;
	}

	public void setLoginemail(String loginemail) {
		this.loginemail.sendKeys(loginemail);
	}

	public WebElement getLoginpassword() {
		return loginpassword;
	}

	public void setLoginpassword(String loginpassword) {
		this.loginpassword.sendKeys(loginpassword);
	}

	public WebElement getCreateaccountsubmitbutton() {
		return createaccountsubmitbutton;
	}

	public WebElement getLoginsubmitbutton() {
		return loginsubmitbutton;
	}
}

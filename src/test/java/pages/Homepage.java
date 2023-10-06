package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver = null;
	
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='search_query_top']")
	private WebElement searchtextbox;
	@FindBy(xpath = "//*[@class='btn btn-default button-search']")
	private WebElement signlink;
	@FindBy(xpath = "//*[text()='Contact us']")
	private WebElement contactus;
	
	public WebElement getSearchtextbox() {
		return searchtextbox;
	}
	public void setSearchtextbox(String str) {
		this.searchtextbox .sendKeys(str);
	}
	public WebElement getSignlink() {
		return signlink;
	}
	public WebElement getContactus() {
		return contactus;
	}
}

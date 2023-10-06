package jun25testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {
	WebDriver driver;
	  @Test
	  public void f() throws Throwable {
		  Actions ac=new Actions(driver);
		     WebElement gr=driver.findElement(By.xpath("//*[@id='input']"));
		    ac.moveToElement(gr).click().sendKeys("TOMATO").doubleClick().build().perform();
		     Thread.sleep(5000);
		     ac.moveToElement(gr).contextClick().build().perform();	
			}
	  @Test
	  public void f3() throws Throwable {
	  Actions ac=new Actions(driver);
	  WebElement hr =driver.findElement(By.xpath("//*[@class='dropdown-toggle meganav-shop']"));
	  ac.moveToElement(hr).build().perform();
	  Thread.sleep(5000);
	  if(hr.isDisplayed() && hr.isEnabled()) {
	 	 driver.findElement(By.xpath("//*[@data-submenu-id='foodgrains-oil-masala']/*[@qa='catL1']")).click();
	  }
	  else {
			System.out.println("webelementis not present");
		}
	  }
	  @Test
	  public void f2() {
		  Actions ac=new Actions(driver);
		  String vegname="tamato";
		     WebElement gr=driver.findElement(By.xpath("//*[@id='input']"));
		     ac.moveToElement(gr).click().keyDown(Keys.SHIFT).sendKeys(vegname).build().perform(); 
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.bigbasket.com/");
			driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
}

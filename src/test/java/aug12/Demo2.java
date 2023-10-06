package aug12;

import org.testng.annotations.Test;

import testbase.Testbase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Demo2 extends Testbase {
	
	
  @Test
  public void f() throws Throwable {
	  driver.get("https://www.bigbasket.com/");
	  Actions ac=new Actions(driver);
	     WebElement gr=driver.findElement(By.xpath("//*[@id='input']"));
	    ac.moveToElement(gr).click().sendKeys("TOMATO").doubleClick().build().perform();
	     Thread.sleep(5000);
	     ac.moveToElement(gr).contextClick().build().perform();	
		}
  @Test
  public void f3() throws Throwable {
	  driver.get("https://www.bigbasket.com/");
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
	  driver.get("https://www.bigbasket.com/");
	  Actions ac=new Actions(driver);
	  String vegname="tamato";
	     WebElement gr=driver.findElement(By.xpath("//*[@id='input']"));
	     ac.moveToElement(gr).click().keyDown(Keys.SHIFT).sendKeys(vegname).build().perform(); 
  }
 

}

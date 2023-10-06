package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
     Actions ac=new Actions(driver);
     /*WebElement hr =driver.findElement(By.xpath("//*[@class='dropdown-toggle meganav-shop']"));
     ac.moveToElement(hr).build().perform();
     Thread.sleep(5000);
     if(hr.isDisplayed() && hr.isEnabled()) {
    	 driver.findElement(By.xpath("//*[@data-submenu-id='foodgrains-oil-masala']/*[@qa='catL1']")).click();
     }
     else {
		System.out.println("webelementis not present");
	}*/
     String vegname="tamato";
     WebElement gr=driver.findElement(By.xpath("//*[@id='input']"));
     ac.moveToElement(gr).click().keyDown(Keys.SHIFT).sendKeys(vegname).build().perform();
     Thread.sleep(5000);
     //ac.moveToElement(gr).click().doubleClick().build().perform();
     Thread.sleep(5000);
     ac.moveToElement(gr).click().contextClick().build().perform();
	}

}

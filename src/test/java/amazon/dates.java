package amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dates {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdrive.chrome.driver","C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/createaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
        Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='aCsJod oJeWuf']//*[@name='firstName']")).sendKeys("siva");
        driver.findElement(By.xpath("//*[@class='aCsJod oJeWuf']//*[@name='lastName']")).sendKeys("alladi");
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        Thread.sleep(5000);
       //driver.findElement(By.xpath("//*[@id='month']")).click();
      Select day = new Select(driver.findElement(By.xpath("//*[@id='month']")));
      List<WebElement>months=day.getOptions();
      System.out.println("stored months"+" "+months.size() );
    //  day.selectByIndex(2);
      //for(WebElement v : months)
      for(int i=0;i<=months.size();i++)
      {
    	  String siva= months.get(i).getText();
    	  System.out.println(siva);
    	  //System.out.println( v.getText());
      }
        //driver.findElement(By.xpath("//*[@id='u_0_k_Zy']")).sendKeys("sivanaidu");
        
        
	}

}

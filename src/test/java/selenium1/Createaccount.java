package selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createaccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.automationpractice.pl/index.php");
		driver.findElement(By.xpath("//*[@class='login']")).click();
		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("kumarcutlet@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("shiva");
		driver.findElement(By.id("customer_lastname")).sendKeys("kumar");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("12345");
		//driver.findElement(By.id("days")).sendKeys("1");
//		Select days=new Select(driver.findElement(By.id("days")));
//		days.selectByIndex(10);
	//	List<WebElement>siva=days.getOptions();
//		for(int i=0;i<=siva.size();i++) {
//		//System.out.println(siva.get(2).getText());
//		System.out.println(siva.get(i).getText());
//		
//		}
//		for(WebElement w:siva) {
//			System.out.println(w.getText());
//		}
//		Select month=new Select(driver.findElement(By.id("months")));
//		month.selectByIndex(5);
//		Select years=new Select(driver.findElement(By.id("years")));
//		years.selectByIndex(10);
		Select days=new Select(driver.findElement(By.id("days")));
		days.selectByValue("7");
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByValue("8");
		Select years=new Select(driver.findElement(By.id("years")));
		years.selectByVisibleText("2015  ");
		driver.findElement(By.xpath("//*[@id='newsletter']")).click();
		driver.close();
	}

}
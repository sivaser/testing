package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
//		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("T-shirts");
//      driver.findElement(By.xpath("//*[@class='btn btn-default button-search']")).click();
//		driver.findElement(By.xpath("//*[@class='login']")).click();
//      driver.findElement(By.xpath("//*[text()='Contact us']")).click();
//		driver.findElement(By.linkText("Contact us")).click();
//		driver.findElement(By.partialLinkText("Terms and ")).click();
//	    driver.quit();	
//	    driver.close();
		driver.findElement(By.xpath("//*[@class='login']")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("santosh@test.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("12345");	
		driver.findElement(By.id("SubmitLogin")).click();
	}
}

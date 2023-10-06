package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexamples {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.automationpractice.pl/index.php");
		driver.findElement(By.xpath("//*[@class='login']")).click();
		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("kumarcutlet@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		driver.findElement(By.xpath("//*[@name='id_gender'and @id='id_gender1']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Contact ')]")).click();
		driver.findElement(By.xpath("//*[starts-with(@id,'search_query_top')]")).click();
		driver.findElement(By.xpath("//*[text()='Contact us']")).click();
		driver.findElement(By.xpath("//*[@id='search_query_top' or @name='search_query']")).click();
		
		
	}

}

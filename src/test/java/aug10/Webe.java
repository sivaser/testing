package aug10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@class='login']")).click();
//		
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sivacutlet@gmail.com");
//		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("123456");
//
//		Thread.sleep(5000);
//		String siva=driver.findElement(By.xpath("//*[@id='email']")).getAttribute("value");
//		String kumar=driver.findElement(By.xpath("//*[@id='passwd']")).getAttribute("value");
//		
//		System.out.println(siva);
//		System.out.println(kumar);
		String siva="Newsletter";
		String raja=driver.findElement(By.xpath("//div[@id='newsletter_block_left']/h4")).getText();
		System.out.println(raja);
		if(siva.equalsIgnoreCase(raja)) {
		System.out.println("website text on home page:pass");
		}
		else {
			System.out.println("website text on home not page:pass");
		}
	}

}

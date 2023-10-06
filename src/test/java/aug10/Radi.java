package aug10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='login']")).click();
		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("kumarcutlet@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("shiva");
		driver.findElement(By.id("customer_lastname")).sendKeys("kumar");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("12345");
		boolean result=driver.findElement(By.xpath("//*[@id='id_gender1']")).isSelected();
		if(result==true) {
			System.out.println("selected mr");
		}
		else {
			System.out.println("not selected mr");
		}
	}

}

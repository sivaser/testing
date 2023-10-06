package aug10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethodes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		String webpagetitle=driver.getTitle();
		System.out.println("title of the webpage" + webpagetitle);
		String currenturl=driver.getCurrentUrl();
		System.out.println("current url" +currenturl);
		//System.out.println(driver.getPageSource());
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		driver.findElement(By.name("submit_search")).click();
//	String searchtext=driver.findElement(By.id("search_query_top")).getText();
//	System.out.println("search text"+searchtext);
		String searchtext=driver.findElement(By.xpath("//*[@class='lighter']")).getText();
	System.out.println("search text"+searchtext);
	}

}

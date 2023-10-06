package action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> ele=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		
		int size=ele.size();
		
		for(int i=0;i<size;i++) {
			String siva=ele.get(i).getText();
			System.out.println(siva);
		}
	}

}

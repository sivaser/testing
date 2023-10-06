package action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("(//div[@class='col-wraper'])[1]/ul/li/a"));
		//System.out.println("totallinks:"+links);
		
		for(int i=0;i<links.size();i++) {
			
			if(links.get(i).getText().equals("privaccy policy")) {
				continue;
			}
			System.out.println(links.get(i).getText());
		}
    
	}

}

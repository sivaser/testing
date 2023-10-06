package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Arrow_Down_Enter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("colgate");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
        if(driver.findElement(By.xpath("//*[@id='search']/span/div/h1/div/div/div/div/span[3]")).getText().contains("colgate")){
        	System.out.println("pass");
        }
        else {
			System.out.println("fail");
		}
	}

}

package action;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Return;

public class JavascriptDom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
	
	   Actions act=new Actions(driver);
	   WebElement search=driver.findElement(By.xpath("//*[@id='input']"));
	   act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("COLGATE").build().perform();
	   
	   
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   String exe="return document.getElememtByID(\"input\").value";
	   System.out.println(exe);
	   
	   String res = (String) js.executeScript(exe);
	   System.out.println("vaue is ==>" +res+"<==");
	}

}

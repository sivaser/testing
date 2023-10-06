package windowhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\geckodriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        Thread.sleep(3000 );
        //get handles of the window
        String mainwindowhandle=driver.getWindowHandle();
        Set<String>allwindows=driver.getWindowHandles();
        Iterator<String> iterator=allwindows.iterator();
        //here we will check if child wimdow has other child window and will fetch the heading of the child window
        while(iterator.hasNext()) {
        	String childwindow=iterator.next();
        	if(!mainwindowhandle.equalsIgnoreCase(childwindow)) {
        		driver.switchTo().window(childwindow);
        		WebElement text=driver.findElement(By.id("sampleHeading"));
        		System.out.println("heading of child window"+text.getText()); 
        	}
        }
	}

}

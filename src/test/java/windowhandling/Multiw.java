package windowhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiw {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\geckodriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
      driver.manage().window().maximize();
      driver.get("https://demoqa.com/browser-windows");
      driver.findElement(By.id("windowButton")).click();
      Thread.sleep(3000 );
      driver.findElement(By.id("messageWindowButton")).click();
      Thread.sleep(3000 );
      String mainwindow=driver.getWindowHandle();
      System.out.println("main window handle is"+mainwindow);
      Set<String>s1=driver.getWindowHandles();
      System.out.println("child window handle"+s1);
      Iterator<String> i1=s1.iterator();
      while(i1.hasNext()) {
      	String childwindow=i1.next();
      	if(!mainwindow.equalsIgnoreCase(childwindow)) {
      		driver.switchTo().window(childwindow);
      		driver.close();
      		Thread.sleep(3000);
      		System.out.println("child window closed");
      		
      		
      	}
	}
	}
	public void siva() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(3000 );
	      driver.findElement(By.id("messageWindowButton")).click();
	      Thread.sleep(3000 );
	      String s1=driver.getWindowHandle();
	      System.out.println("main window"+s1);
	      Set<String>s2=driver.getWindowHandles();
	      System.out.println("child windo"+s2);
	      Iterator<String>s3=s2.iterator();
	      while(s3.hasNext()) {
	    	  String s4=s3.next();
	    	  if(!s1.equalsIgnoreCase(s4)) {
	    		  driver.switchTo().window(s4);
	    		  driver.close();
	    		  System.out.println("closed");
	    		  
	    	  }
}
	}
}
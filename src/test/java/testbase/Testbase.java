package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.Authenthicationpage;
import pages.Homepage;

public class Testbase {
	 public static WebDriver driver;
	 protected Homepage homepageobj;
	 protected Authenthicationpage authpageobj;
	 public Properties prop;
	 public FileInputStream fis;
	@BeforeTest(groups={"login2","smoke","regression"})
	 public void befortest() throws Throwable {
		prop=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		prop.load(fis);
		if(prop.getProperty("browser").equals("chrome")) {
//			ChromeOptions options=new ChromeOptions();
//			options.addArguments("--headless","--disable-gpu","--window-size=1920,1200","--ignore--certificate-errors");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
			else if (prop.getProperty("browser").equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\geckodriver.exe");
				 driver=new ChromeDriver();
			}
				else if (prop.getProperty("browser").equals("edge")) {
					System.setProperty("webdriver.edge.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\edgedriver.exe");
					 driver=new ChromeDriver();
				}
				else {
					System.out.println("no browser issupportwd here");
					System.exit(0);
				}
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\radhika\\eclipse-workspace\\kumarsiva\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		homepageobj=new Homepage(driver);
		authpageobj=new Authenthicationpage(driver);
	}
@AfterTest
public void aftertest() {
	driver.close();
	
}
}

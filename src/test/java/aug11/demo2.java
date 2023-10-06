package aug11;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class demo2 {
  
  
  @Test
  public void siva() {
	  System.out.println("hello world 2");
  }
  @Test
  public void f0x() {
	  System.out.println("hello siva");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("iam from BM");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am from AM");
  }

}

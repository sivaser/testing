package aug11;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class demo3 {
  @Test
  public void test() {
	  System.out.println("iam from test");
  }
  
  @Test
  public void test2() {
	  System.out.println("iam from test2");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am from before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am from after class");
  }

}

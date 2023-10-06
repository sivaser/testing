package aug11;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class demo4 {
  @Test
  public void f() {
	  System.out.println("iamfrom test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am from before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am from aftertest");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am from before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am from after class");
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

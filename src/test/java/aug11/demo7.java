package aug11;

import org.testng.annotations.Test;

public class demo7 {
  @Test
  public void f() {
	  System.out.println("i am from Apple");
  }
  @Test
  public void Bannana() {
	  System.out.println("i am from Bannana");
  }
  @Test
  public void Mango() {
	  System.out.println("i am from Mango");
  }
  @Test(dependsOnMethods = "Bannana")
  public void Papaya() {
	  System.out.println("i am from Papaya");
  }
}

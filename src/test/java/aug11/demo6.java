package aug11;

import org.testng.annotations.Test;

public class demo6 {
  @Test(priority = 2)
  public void Apple() {
	  System.out.println("i am from Apple");
  }
  @Test(priority = 1)
  public void Bannana() {
	  System.out.println("i am from Bannana");
  }
  @Test(priority =3 )
  public void Mango() {
	  System.out.println("i am from Mango");
  }
  @Test(priority = 4)
  public void Papaya() {
	  System.out.println("i am from Papaya");
  }
}

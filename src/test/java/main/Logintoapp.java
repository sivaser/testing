package main;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testbase.Testbase;

public class Logintoapp extends Testbase {

	@Test(groups={"login2","smoke","regression"})
	public void Login() {
		homepageobj.getSignlink().click();
		
		authpageobj.setLoginemail(prop.getProperty("Username"));
		authpageobj.setLoginpassword("123456");
		authpageobj.getLoginsubmitbutton().click();;
	}
	@Parameters({"username","password"})
	@Test
	public void login2(String uname,String pwd) {
		homepageobj.getSignlink().click();
		authpageobj.setLoginemail(uname);
	}
}

package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeClass
public void openBrowser() {
	Reporter.log("open the Browser",true);
}
	@BeforeMethod
	public void loginApplication() {
		Reporter.log("login the application",true);
	}
	@Test
	public void verifyID() {
		Reporter.log("verify the userID",true);
	}
	@AfterMethod
	public void logoutapplication() {
		Reporter.log("logout the application",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close the browser",true);
	}
}

package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 3)
public void TC1() {
	Reporter.log("how r u",true);
}
	@Test(priority = 2)
	public void TC2() {
		Reporter.log("hello",true);
	}
	
	@Test(priority = 4)
	public void TC3() {
		Reporter.log("fine",true);
	}
	
	@Test(priority = 1)
	public void TC4() {
		Reporter.log("hii",true);
	}
	
}

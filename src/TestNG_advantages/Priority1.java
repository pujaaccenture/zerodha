package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority = 1)
public void TC1() {
	Reporter.log("hi",true);
}
	@Test(priority = -1)
	public void TC2() {
		Reporter.log("hello",true);
	}
}

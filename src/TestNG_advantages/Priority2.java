package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority2 {
	@Test
public void TC1() {
	Reporter.log("hii",true);
}
	@Test(priority = 1)
		public void TC2() {
		Reporter.log("hello",true);
}
}
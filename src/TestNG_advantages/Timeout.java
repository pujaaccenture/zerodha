package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut = 6000)
public void TC() {
	Reporter.log("hii",true);
}
}

package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report {
	@Test
public void Tc() {
	Reporter.log("hii",true);
}
}

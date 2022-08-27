package testNg_programs;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_notequal {
	@Test
public void TC2() {
	Reporter.log("Running TC2",true);
	String expR = "monkey";
	String actR = "donkey";
	Assert.assertNotEquals(expR, actR);
}
}
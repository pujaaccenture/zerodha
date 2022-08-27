package testNg_programs;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equal {
	@Test
	public void TC1() {
		Reporter.log("TC1 is running",true);
		String expR="dolly";
		String actR="dolly";
		Assert.assertEquals(expR, actR);
	}
}

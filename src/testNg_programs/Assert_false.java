package testNg_programs;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_false {
@Test
public void TC4() {
	Reporter.log("running tc4",true);
	boolean actR = false;
	Assert.assertFalse(actR);
}

}

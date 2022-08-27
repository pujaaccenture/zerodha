package testNg_programs;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail1 {
@Test
public void TC1() {
	Reporter.log("running TC1",true);
	Assert.fail();//verification 1
	System.out.println("i am failes");
}
@Test
public void TC2() {
	Reporter.log("running TC2",true);
}
}

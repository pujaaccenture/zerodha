package testNg_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_soft1 {
@Test
public void Tc1() {
	Reporter.log("running TC1",true);
	String s1 = "ram";
	String s2 = "sham";
	SoftAssert s=new SoftAssert();
	s.assertEquals(s1, s2);
	System.out.println("i am failed");
	s.assertAll();
}
@Test
public void TC2() {
	Reporter.log("running TC2",true);
}
}

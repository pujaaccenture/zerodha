package testNg_programs;


import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Soft {
	@Test
public void TC1() {
	Reporter.log("running TC1",true);
	String act="hii";
	String exp="hello";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(exp,act);//verification 1
	System.out.println("i am after failed verification");
	//mandatory
	soft.assertAll();
	}
	@Test
	public void Tc2() {
		Reporter.log("bye");
}
}

package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_TC_using_keyword {
	@Test
	public void Tc1() {
		Reporter.log("Running tc1",true);
		}
		
		@Test
		public void TC2() {
			Reporter.log("Running tc2",true);
		}
		@Test(enabled = false)
		public void TC3() {
			Reporter.log("Running tc3",true);
		}

}

package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void Tc1() {
		Reporter.log("Running tc1",true);
		}
		
		@Test
		public void TC2() {
			Reporter.log("Running tc2",true);
		}
		@Test
		public void TC3() {
			Reporter.log("Running tc3",true);
		}

}

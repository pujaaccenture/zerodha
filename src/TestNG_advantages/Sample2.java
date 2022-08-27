package TestNG_advantages;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void Tc4() {
		Reporter.log("Running tc4",true);
		}
		
		@Test
		public void TC5() {
			Reporter.log("Running tc5",true);
		}
		@Test
		public void TC6() {
			Reporter.log("Running tc6",true);
		}

}

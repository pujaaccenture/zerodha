package POM_with_ddf_using_testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePageT {
	//step1
		@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement ETT;
		
		//step2
		public ActitimeHomePageT (WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//step3
		public String verifyETT() {	
		String act = ETT.getText();
		return act;

}
}
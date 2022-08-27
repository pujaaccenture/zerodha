package POM_with_ddf_using_testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogin1PageT {
	//step1 declaration
		@FindBy(xpath = "//input[@id='username']")private WebElement UN;
		@FindBy(xpath = "//input[@name='pwd']")private WebElement PWD;
		@FindBy(xpath = "//div[text()='Login ']")private WebElement LOGINBTN;
		
		//step2 initiolazation
		public ActitimeLogin1PageT(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//step3 utilazation
		public void enterUN(String username) {
			UN.sendKeys(username);
		}
		public void enterPWD(String password) {
			PWD.sendKeys(password);	
		}
		public void clickLOGINBTN() {
			LOGINBTN.click();
}
}
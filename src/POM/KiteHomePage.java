package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//step1 declaration
@FindBy(xpath = "//span[@class='user-id']")private WebElement USERID;

//step2 intialization
public KiteHomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//step3
public void verifyUSERID() {
	String exptID = "DPG458";
	 String actID = USERID.getText();
	 if(actID.equals(exptID)) {
		 System.out.println("TC is pass");
	 }
	 else {
		 System.out.println("TC is fail");
	 }
}
}

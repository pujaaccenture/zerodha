package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomeddfPage {
@FindBy(xpath = "//span[@class='user-id']")private WebElement USERID;

//step2
public KiteHomeddfPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//step3
public void verifyuserID(String exptID ) {
	String actID=USERID.getText();
	if(actID.equals(exptID)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("TC is fail");
	}
}
}

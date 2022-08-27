package POM_with_ddf_using_testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePageT {
@FindBy(xpath = "//span[@class='user-id']")private WebElement USERID;

public KiteHomePageT(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public String verifyUSERID() {
	String actID=USERID.getText();
	return actID;
	
}
}

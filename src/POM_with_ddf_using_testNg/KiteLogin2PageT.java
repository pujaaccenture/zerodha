package POM_with_ddf_using_testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteLogin2PageT {
@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement CONBTN;

public KiteLogin2PageT(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void enterPIN(String userID) {
	PIN.sendKeys(userID);
}
public void clickCONBTN() {
	CONBTN.click();
}

}

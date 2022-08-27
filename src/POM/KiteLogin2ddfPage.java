package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2ddfPage {
@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement CONBTN;

//step2
public KiteLogin2ddfPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//step3
public void enterPIN( String userpin) {
	PIN.sendKeys(userpin);
}
public void clickCONBTN() {
	CONBTN.click();
}
}

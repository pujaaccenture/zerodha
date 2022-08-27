package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	//step1 declaration
	@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement CTNBTN;
	
	//step 2 initionlisatin
	public KiteLogin2Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//step 3 utilazation
	public void enterPIN() {
		PIN.sendKeys("171992");
	}
	public void clickCTNBTN() {
		CTNBTN.click();
	}
	
	
}
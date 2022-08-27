package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {
//step1
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement ETT;
	
	//step2
	public ActitimeHomePage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//step3
	public void verifyETT(String exptETT) {
		
	String actETT=ETT.getText();
		if(actETT.equals(exptETT)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}
}

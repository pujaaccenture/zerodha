package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestpage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	//1st pom class
	KiteLogin1Page login1=new KiteLogin1Page(driver);
	login1.enterUN();
	login1.enterPWD();
	login1.enterLOGINBTN();
	
	//2nd pom class
	KiteLogin2Page login2=new KiteLogin2Page(driver);
	login2.enterPIN();
	login2.clickCTNBTN();
	
	//3rd pom class
	KiteHomePage home=new KiteHomePage(driver);
	home.verifyUSERID();
	driver.close();
}
}


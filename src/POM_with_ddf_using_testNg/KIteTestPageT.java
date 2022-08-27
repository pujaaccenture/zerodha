package POM_with_ddf_using_testNg;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KIteTestPageT {
	Sheet sh ;
	WebDriver driver;
	Kitelogin1PageT login1;
	KiteLogin2PageT login2;
	KiteHomePageT home;
@Test
@BeforeClass
public void openBrowser() throws Throwable {
FileInputStream file =new FileInputStream("C:\\Users\\Trupi\\Documents\\May7.xlsx");
sh = WorkbookFactory.create(file).getSheet("Sheet1");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//enter the url
driver.get("https://kite.zerodha.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//crete object
 login1=new Kitelogin1PageT(driver);
 login2=new KiteLogin2PageT(driver);
 home=new KiteHomePageT(driver);
}
@BeforeMethod
public void loginToApp() {
	String username = sh.getRow(0).getCell(0).getStringCellValue();
	login1.enterUN(username);

	String password = sh.getRow(0).getCell(1).getStringCellValue();
	login1.enterPWD(password);
	login1.clickLOGBTN();
	
	String userpin = sh.getRow(0).getCell(2).getStringCellValue();
	login2.enterPIN(userpin);
	login2.clickCONBTN();
	
}
@Test
public void verifyUSERID() {
	String actID=home.verifyUSERID();
	String expID=sh.getRow(0).getCell(0).getStringCellValue();
	Reporter.log("running verify user ID",true);
	Assert.assertEquals(actID, expID,"both are different tc is failed");
}
@AfterMethod
public void logoutApp() {
	Reporter.log("logout the application",true);
	
}
@AfterClass
public void closeBrowser() {
	Reporter.log("close the app",true);
}
}
	
	
	


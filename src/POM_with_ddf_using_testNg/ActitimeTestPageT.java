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

public class ActitimeTestPageT {
	Sheet sh;
	WebDriver driver;
	ActitimeLogin1PageT login;
	ActitimeHomePageT home;
@Test
@BeforeClass
public void openBrowser() throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Trupi\\Documents\\May7.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("Sheet2");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			 login=new ActitimeLogin1PageT(driver);
			 home=new ActitimeHomePageT(driver);
}
@BeforeMethod
public void loginToApp() {
	String username = sh.getRow(0).getCell(0).getStringCellValue();  
	login.enterUN(username);

	String password = sh.getRow(0).getCell(1).getStringCellValue();
	login.enterPWD(password);
	login.clickLOGINBTN();
	String act=home.verifyETT();
	String expt = sh.getRow(0).getCell(2).getStringCellValue();
	Reporter.log("running verify ETT",true);
	Assert.assertEquals(act, expt,"both are different tc is fail");
}
@AfterMethod
public void logoutApp() {
	Reporter.log("logout to application",true);
	
}
@AfterClass
public void closeBrowser() {
	Reporter.log("close the app",true);
}
}
			
			
		
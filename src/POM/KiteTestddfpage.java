package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestddfpage {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Trupi\\Documents\\May7.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//enter the url
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//1st POM class
	KiteLogin1ddfPage login1=new KiteLogin1ddfPage(driver);
	String username = sh.getRow(0).getCell(0).getStringCellValue();
	login1.enterUN(username);
	String password = sh.getRow(0).getCell(1).getStringCellValue();
	login1.enterPWD(password);
	login1.clickLOGINBTN();
	
	//2nd POM class
	KiteLogin2ddfPage login2=new KiteLogin2ddfPage(driver);
	String userpin = sh.getRow(0).getCell(2).getStringCellValue();
	login2.enterPIN(userpin);
	login2.clickCONBTN();
	
	//3rd
	KiteHomeddfPage home=new KiteHomeddfPage(driver);
	String exptID = sh.getRow(0).getCell(0).getStringCellValue();
	home.verifyuserID(exptID);
}
}

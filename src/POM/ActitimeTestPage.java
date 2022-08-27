package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTestPage {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Trupi\\Documents\\May7.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trupi\\Desktop\\java program\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	//1st pom class
	ActitimeLoginPage alp=new ActitimeLoginPage(driver);
	String username = sh.getRow(0).getCell(0).getStringCellValue();  
	alp.enterUN(username);
	String password = sh.getRow(0).getCell(1).getStringCellValue();
	alp.enterPWD(password);
	alp.clickLOGINBTN();
	
	//2nd POM
	ActitimeHomePage home=new ActitimeHomePage(driver);
	String exptETT = sh.getRow(0).getCell(2).getStringCellValue();
	home.verifyETT(exptETT);
}
}
